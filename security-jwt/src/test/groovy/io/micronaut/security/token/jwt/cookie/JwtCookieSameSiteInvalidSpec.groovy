package io.micronaut.security.token.jwt.cookie

import io.micronaut.context.annotation.Requires
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.security.authentication.AuthenticationFailed
import io.micronaut.security.authentication.AuthenticationProvider
import io.micronaut.security.authentication.AuthenticationRequest
import io.micronaut.security.authentication.AuthenticationResponse
import io.micronaut.security.authentication.UserDetails
import io.micronaut.testutils.EmbeddedServerSpecification
import io.reactivex.Flowable
import org.reactivestreams.Publisher

import javax.inject.Singleton

class JwtCookieSameSiteInvalidSpec extends EmbeddedServerSpecification {

    @Override
    String getSpecName() {
        'JwtCookieSameSiteInvalidSpec'
    }

    @Override
    Map<String, Object> getConfiguration() {
        super.configuration + [
                'micronaut.http.client.followRedirects': false,
                'micronaut.security.endpoints.login.enabled': true,
                'micronaut.security.endpoints.logout.enabled': true,
                'micronaut.security.token.jwt.bearer.enabled': false,
                'micronaut.security.token.jwt.cookie.enabled': true,
                'micronaut.security.token.jwt.cookie.cookie-max-age': '5m',
                'micronaut.security.token.jwt.cookie.cookie-same-site': 'nonesense',
                'micronaut.security.token.jwt.cookie.login-failure-target-url': '/login/authFailed',
                'micronaut.security.token.jwt.signatures.secret.generator.secret': 'qrD6h8K6S9503Q06Y6Rfk21TErImPYqa',
        ]
    }

    void "test same-site cookie setting cannot have invalid value"() {
        when:
        HttpRequest loginRequest = HttpRequest.POST('/login', new LoginForm(username: 'sherlock', password: 'password'))
                .contentType(MediaType.APPLICATION_FORM_URLENCODED_TYPE)
        HttpResponse loginRsp = client.exchange(loginRequest, String)

        then:
        noExceptionThrown()

        when:
        String cookie = loginRsp.getHeaders().get('Set-Cookie')

        then:
        cookie.contains('SameSite') == false
    }

    @Requires(property = "spec.name", value = "JwtCookieSameSiteInvalidSpec")
    @Singleton
    static class AuthenticationProviderUserPassword implements AuthenticationProvider  {

        @Override
        Publisher<AuthenticationResponse> authenticate(HttpRequest<?> httpRequest, AuthenticationRequest<?, ?> authenticationRequest) {
            if ( authenticationRequest.getIdentity().equals("sherlock") &&
                    authenticationRequest.getSecret().equals("password") ) {
                return Flowable.just(new UserDetails((String) authenticationRequest.getIdentity(), new ArrayList<>()))
            }
            return Flowable.just(new AuthenticationFailed())
        }
    }
}
