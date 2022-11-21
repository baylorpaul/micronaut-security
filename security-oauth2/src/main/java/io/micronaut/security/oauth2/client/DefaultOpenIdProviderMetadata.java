/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.security.oauth2.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.annotation.ReflectiveAccess;
import io.micronaut.serde.annotation.Serdeable;

import java.util.Arrays;
import java.util.List;

/**
 * @see <a href="https://openid.net/specs/openid-connect-discovery-1_0.html">OpenID connect Discovery Spec</a>
 *
 * @author Sergio del Amo
 * @since 1.2.0
 */
@ReflectiveAccess
@Serdeable
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DefaultOpenIdProviderMetadata implements OpenIdProviderMetadata {

    @NonNull
    private final String authorizationEndpoint;

    @NonNull
    private final List<String> idTokenSigningAlgValuesSupported;

    @NonNull
    private final String issuer;

    @NonNull
    private final String jwksUri;

    @Nullable
    private final List<String> acrValuesSupported;

    @Nullable
    private final List<String> responseTypesSupported;

    @Nullable
    private final List<String> responseModesSupported;

    @Nullable
    private final List<String> scopesSupported;

    @Nullable
    private final List<String> grantTypesSupported;

    @NonNull
    private final List<String> subjectTypesSupported;

    @NonNull
    private final String tokenEndpoint;

    @Nullable
    private final List<String> tokenEndpointAuthMethodsSupported;

    @Nullable
    private final String userinfoEndpoint;

    @Nullable
    private final String registrationEndpoint;

    @Nullable
    private final List<String> claimsSupported;

    @Nullable
    private final List<String> codeChallengeMethodsSupported;

    @Nullable
    private final String introspectionEndpoint;

    @Nullable
    private final List<String> introspectionEndpointAuthMethodsSupported;

    @Nullable
    private final String revocationEndpoint;

    @Nullable
    private final List<String> revocationEndpointAuthMethodsSupported;

    @Nullable
    private final String endSessionEndpoint;

    @Nullable
    private final Boolean requestParameterSupported;

    @Nullable
    private final Boolean requestUriParameterSupported;

    @Nullable
    private final Boolean requireRequestUriRegistration;

    @Nullable
    private final List<String> requestObjectSigningAlgValuesSupported;

    @Nullable
    private final String serviceDocumentation;

    @Nullable
    private final List<String> idTokenEncryptionEncValuesSupported;

    @Nullable
    private final List<String> displayValuesSupported;

    @Nullable
    private final List<String> claimTypesSupported;

    @Nullable
    private final Boolean claimsParameterSupported = Boolean.FALSE;

    @Nullable
    private final String opTosUri;

    @Nullable
    private final String opPolicyUri;

    @Nullable
    private final List<String> uriLocalesSupported;

    @Nullable
    private final List<String> claimsLocalesSupported;

    @Nullable
    private final List<String> userinfoEncryptionAlgValuesSupported;

    @Nullable
    private final List<String> userinfoEncryptionEncValuesSupported;

    @Nullable
    private final List<String> tokenEndpointAuthSigningAlgValuesSupported;

    @Nullable
    private final List<String> requestObjectEncryptionAlgValuesSupported;

    @Nullable
    private final List<String> requestObjectEncryptionEncValuesSupported;

    @Nullable
    private final String checkSessionIframe;

    @SuppressWarnings("ParameterNumber")
    public DefaultOpenIdProviderMetadata(@Nullable String authorizationEndpoint,
                                         @NonNull List<String> idTokenSigningAlgValuesSupported,
                                         @NonNull String issuer,
                                         @NonNull String jwksUri,
                                         @Nullable List<String> acrValuesSupported,
                                         @Nullable List<String> responseTypesSupported,
                                         @Nullable List<String> responseModesSupported,
                                         @Nullable List<String> scopesSupported,
                                         @Nullable List<String> grantTypesSupported,
                                         @NonNull List<String> subjectTypesSupported,
                                         @NonNull String tokenEndpoint,
                                         @Nullable List<String> tokenEndpointAuthMethodsSupported,
                                         @Nullable String userinfoEndpoint,
                                         @Nullable String registrationEndpoint,
                                         @Nullable List<String> claimsSupported,
                                         @Nullable List<String> codeChallengeMethodsSupported,
                                         @Nullable String introspectionEndpoint,
                                         @Nullable List<String> introspectionEndpointAuthMethodsSupported,
                                         @Nullable String revocationEndpoint,
                                         @Nullable List<String> revocationEndpointAuthMethodsSupported,
                                         @Nullable String endSessionEndpoint,
                                         @Nullable Boolean requestParameterSupported,
                                         @Nullable Boolean requestUriParameterSupported,
                                         @Nullable Boolean requireRequestUriRegistration,
                                         @Nullable List<String> requestObjectSigningAlgValuesSupported,
                                         @Nullable String serviceDocumentation,
                                         @Nullable List<String> idTokenEncryptionEncValuesSupported,
                                         @Nullable List<String> displayValuesSupported,
                                         @Nullable List<String> claimTypesSupported,
                                         @Nullable String opTosUri,
                                         @Nullable String opPolicyUri,
                                         @Nullable List<String> uriLocalesSupported,
                                         @Nullable List<String> claimsLocalesSupported,
                                         @Nullable List<String> userinfoEncryptionAlgValuesSupported,
                                         @Nullable List<String> userinfoEncryptionEncValuesSupported,
                                         @Nullable List<String> tokenEndpointAuthSigningAlgValuesSupported,
                                         @Nullable List<String> requestObjectEncryptionAlgValuesSupported,
                                         @Nullable List<String> requestObjectEncryptionEncValuesSupported,
                                         @Nullable String checkSessionIframe) {
        this.authorizationEndpoint = authorizationEndpoint;
        this.idTokenSigningAlgValuesSupported = idTokenSigningAlgValuesSupported;
        this.issuer = issuer;
        this.jwksUri = jwksUri;
        this.acrValuesSupported = acrValuesSupported;
        this.responseTypesSupported = responseTypesSupported;
        this.responseModesSupported = responseModesSupported;
        this.scopesSupported = scopesSupported;
        this.grantTypesSupported = grantTypesSupported;
        this.subjectTypesSupported = subjectTypesSupported;
        this.tokenEndpoint = tokenEndpoint;
        this.tokenEndpointAuthMethodsSupported = tokenEndpointAuthMethodsSupported;
        this.userinfoEndpoint = userinfoEndpoint;
        this.registrationEndpoint = registrationEndpoint;
        this.claimsSupported = claimsSupported;
        this.codeChallengeMethodsSupported = codeChallengeMethodsSupported;
        this.introspectionEndpoint = introspectionEndpoint;
        this.introspectionEndpointAuthMethodsSupported = introspectionEndpointAuthMethodsSupported;
        this.revocationEndpoint = revocationEndpoint;
        this.revocationEndpointAuthMethodsSupported = revocationEndpointAuthMethodsSupported;
        this.endSessionEndpoint = endSessionEndpoint;
        this.requestParameterSupported = requestParameterSupported;
        this.requestUriParameterSupported = requestUriParameterSupported;
        this.requireRequestUriRegistration = requireRequestUriRegistration;
        this.requestObjectSigningAlgValuesSupported = requestObjectSigningAlgValuesSupported;
        this.serviceDocumentation = serviceDocumentation;
        this.idTokenEncryptionEncValuesSupported = idTokenEncryptionEncValuesSupported;
        this.displayValuesSupported = displayValuesSupported;
        this.claimTypesSupported = claimTypesSupported;
        this.opTosUri = opTosUri;
        this.opPolicyUri = opPolicyUri;
        this.uriLocalesSupported = uriLocalesSupported;
        this.claimsLocalesSupported = claimsLocalesSupported;
        this.userinfoEncryptionAlgValuesSupported = userinfoEncryptionAlgValuesSupported;
        this.userinfoEncryptionEncValuesSupported = userinfoEncryptionEncValuesSupported;
        this.tokenEndpointAuthSigningAlgValuesSupported = tokenEndpointAuthSigningAlgValuesSupported;
        this.requestObjectEncryptionAlgValuesSupported = requestObjectEncryptionAlgValuesSupported;
        this.requestObjectEncryptionEncValuesSupported = requestObjectEncryptionEncValuesSupported;
        this.checkSessionIframe = checkSessionIframe;
    }

    /**
     *
     * @return Boolean value specifying whether the OP requires any request_uri values used to be pre-registered using the request_uris registration parameter.
     */
    @Nullable
    public Boolean getRequireRequestUriRegistration() {
        return requireRequestUriRegistration;
    }

    /**
     *
     * @return If require_request_uri_registration omitted, the default value is false.
     */
    @Nullable
    public Boolean getDefaultRequireRequestUriRegistration() {
        return Boolean.FALSE;
    }

    @Nullable
    @Override
    public String getAuthorizationEndpoint() {
        return authorizationEndpoint;
    }

    @NonNull
    @Override
    public List<String> getIdTokenSigningAlgValuesSupported() {
        return idTokenSigningAlgValuesSupported;
    }

    @Nullable
    @Override
    public List<String> getIdTokenEncryptionEncValuesSupported() {
        return idTokenEncryptionEncValuesSupported;
    }

    @Nullable
    @Override
    public List<String> getUserInfoEncryptionAlgValuesSupported() {
        return userinfoEncryptionAlgValuesSupported;
    }

    @Nullable
    @Override
    public List<String> getUserinfoEncryptionEncValuesSupported() {
        return userinfoEncryptionEncValuesSupported;
    }

    @NonNull
    @Override
    public String getIssuer() {
        return issuer;
    }

    @NonNull
    @Override
    public String getJwksUri() {
        return jwksUri;
    }

    /**
     * As specified in Open ID Discovery Spec, if omitted, the
     * default for Dynamic OpenID Providers is ["query", "fragment"].
     * @return Supported response types.
     */
    @Nullable
    @Override
    public List<String> getResponseTypesSupported() {
        return responseTypesSupported;
    }

    /**
     *
     * @return if Response Types Supported is ommited, default for Dynamic OpenID Providers is ["query", "fragment"].
     */
    @NonNull
    public List<String> getDefaultResponseTypesSupported() {
        return Arrays.asList("query", "fragment");
    }

    @Nullable
    @Override
    public List<String> getScopesSupported() {
        return scopesSupported;
    }

    @NonNull
    @Override
    public List<String> getSubjectTypesSupported() {
        return subjectTypesSupported;
    }

    @NonNull
    @Override
    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    @Nullable
    @Override
    public List<String> getTokenEndpointAuthMethodsSupported() {
        return tokenEndpointAuthMethodsSupported;
    }

    @Nullable
    @Override
    public List<String> getTokenEndpointAuthSigningAlgValuesSupported() {
        return tokenEndpointAuthSigningAlgValuesSupported;
    }

    @Nullable
    @Override
    public List<String> getDisplayValuesSupported() {
        return displayValuesSupported;
    }

    @Nullable
    @Override
    public List<String> getClaimTypesSupported() {
        return claimTypesSupported;
    }

    @Nullable
    @Override
    public String getUserinfoEndpoint() {
        return userinfoEndpoint;
    }

    @Nullable
    @Override
    public List<String> getResponseModesSupported() {
        return responseModesSupported;
    }

    @Nullable
    @Override
    public List<String> getGrantTypesSupported() {
        return grantTypesSupported;
    }

    /**
     * As specified in Open ID Discovery Spec, if omitted,
     * the default value is ["authorization_code", "implicit"].
     * @return Default Grant Types if grantTypesSupported is ommited.
     */
    @NonNull
    public List<String> getDefaultGrantTypesSupported() {
        return Arrays.asList("authorization_code", "implicit");
    }

    @Nullable
    @Override
    public List<String> getAcrValuesSupported() {
        return acrValuesSupported;
    }

    @Nullable
    @Override
    public String getRegistrationEndpoint() {
        return registrationEndpoint;
    }

    @Nullable
    @Override
    public List<String> getClaimsSupported() {
        return claimsSupported;
    }

    @Nullable
    @Override
    public String getServiceDocumentation() {
        return serviceDocumentation;
    }

    @Nullable
    @Override
    public List<String> getClaimsLocalesSupported() {
        return claimsLocalesSupported;
    }

    @Nullable
    @Override
    public List<String> getUriLocalesSupported() {
        return uriLocalesSupported;
    }

    @Nullable
    @Override
    public Boolean getClaimsParameterSupported() {
        return claimsParameterSupported;
    }

    @Nullable
    @Override
    public List<String> getCodeChallengeMethodsSupported() {
        return codeChallengeMethodsSupported;
    }

    @Nullable
    @Override
    public String getIntrospectionEndpoint() {
        return introspectionEndpoint;
    }

    @Nullable
    @Override
    public List<String> getIntrospectionEndpointAuthMethodsSupported() {
        return introspectionEndpointAuthMethodsSupported;
    }

    @Nullable
    @Override
    public String getRevocationEndpoint() {
        return revocationEndpoint;
    }

    @Nullable
    @Override
    public List<String> getRevocationEndpointAuthMethodsSupported() {
        return revocationEndpointAuthMethodsSupported;
    }

    @Nullable
    @Override
    public String getCheckSessionIframe() {
        return checkSessionIframe;
    }

    @Nullable
    @Override
    public String getEndSessionEndpoint() {
        return endSessionEndpoint;
    }

    @Nullable
    @Override
    public Boolean getRequestParameterSupported() {
        return requestParameterSupported;
    }

    /**
     * @return As per spec, If requestParameterSupported omitted, the default value is false.
     */
    @NonNull
    public Boolean getDefaultRequestParameterSupported() {
        return Boolean.FALSE;
    }

    @Nullable
    @Override
    public Boolean getRequestUriParameterSupported() {
        return requestUriParameterSupported;
    }

    /**
     * @return As per spec, If requestUriParameterSupported omitted, the default value is false.
     */
    @NonNull
    public Boolean getDefaultRequestUriParameterSupported() {
        return Boolean.TRUE;
    }

    @Nullable
    @Override
    public String getOpPolicyUri() {
        return opPolicyUri;
    }

    @Nullable
    @Override
    public String getOpTosUri() {
        return opTosUri;
    }

    @Nullable
    @Override
    public List<String> getRequestObjectSigningAlgValuesSupported() {
        return requestObjectSigningAlgValuesSupported;
    }

    @Nullable
    @Override
    public List<String> getRequestObjectEncryptionAlgValuesSupported() {
        return requestObjectEncryptionAlgValuesSupported;
    }

    @Nullable
    @Override
    public List<String> getRequestObjectEncryptionEncValuesSupported() {
        return requestObjectEncryptionEncValuesSupported;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DefaultOpenIdProviderMetadata that = (DefaultOpenIdProviderMetadata) o;

        if (authorizationEndpoint != null ? !authorizationEndpoint.equals(that.authorizationEndpoint) : that.authorizationEndpoint != null) {
            return false;
        }
        if (idTokenSigningAlgValuesSupported != null ? !idTokenSigningAlgValuesSupported.equals(that.idTokenSigningAlgValuesSupported) : that.idTokenSigningAlgValuesSupported != null) {
            return false;
        }
        if (issuer != null ? !issuer.equals(that.issuer) : that.issuer != null) {
            return false;
        }
        if (jwksUri != null ? !jwksUri.equals(that.jwksUri) : that.jwksUri != null) {
            return false;
        }
        if (acrValuesSupported != null ? !acrValuesSupported.equals(that.acrValuesSupported) : that.acrValuesSupported != null) {
            return false;
        }
        if (responseTypesSupported != null ? !responseTypesSupported.equals(that.responseTypesSupported) : that.responseTypesSupported != null) {
            return false;
        }
        if (responseModesSupported != null ? !responseModesSupported.equals(that.responseModesSupported) : that.responseModesSupported != null) {
            return false;
        }
        if (scopesSupported != null ? !scopesSupported.equals(that.scopesSupported) : that.scopesSupported != null) {
            return false;
        }
        if (grantTypesSupported != null ? !grantTypesSupported.equals(that.grantTypesSupported) : that.grantTypesSupported != null) {
            return false;
        }
        if (subjectTypesSupported != null ? !subjectTypesSupported.equals(that.subjectTypesSupported) : that.subjectTypesSupported != null) {
            return false;
        }
        if (tokenEndpoint != null ? !tokenEndpoint.equals(that.tokenEndpoint) : that.tokenEndpoint != null) {
            return false;
        }
        if (tokenEndpointAuthMethodsSupported != null ? !tokenEndpointAuthMethodsSupported.equals(that.tokenEndpointAuthMethodsSupported) : that.tokenEndpointAuthMethodsSupported != null) {
            return false;
        }
        if (userinfoEndpoint != null ? !userinfoEndpoint.equals(that.userinfoEndpoint) : that.userinfoEndpoint != null) {
            return false;
        }
        if (registrationEndpoint != null ? !registrationEndpoint.equals(that.registrationEndpoint) : that.registrationEndpoint != null) {
            return false;
        }
        if (claimsSupported != null ? !claimsSupported.equals(that.claimsSupported) : that.claimsSupported != null) {
            return false;
        }
        if (codeChallengeMethodsSupported != null ? !codeChallengeMethodsSupported.equals(that.codeChallengeMethodsSupported) : that.codeChallengeMethodsSupported != null) {
            return false;
        }
        if (introspectionEndpoint != null ? !introspectionEndpoint.equals(that.introspectionEndpoint) : that.introspectionEndpoint != null) {
            return false;
        }
        if (introspectionEndpointAuthMethodsSupported != null ? !introspectionEndpointAuthMethodsSupported.equals(that.introspectionEndpointAuthMethodsSupported) : that.introspectionEndpointAuthMethodsSupported != null) {
            return false;
        }
        if (revocationEndpoint != null ? !revocationEndpoint.equals(that.revocationEndpoint) : that.revocationEndpoint != null) {
            return false;
        }
        if (revocationEndpointAuthMethodsSupported != null ? !revocationEndpointAuthMethodsSupported.equals(that.revocationEndpointAuthMethodsSupported) : that.revocationEndpointAuthMethodsSupported != null) {
            return false;
        }
        if (endSessionEndpoint != null ? !endSessionEndpoint.equals(that.endSessionEndpoint) : that.endSessionEndpoint != null) {
            return false;
        }
        if (requestParameterSupported != null ? !requestParameterSupported.equals(that.requestParameterSupported) : that.requestParameterSupported != null) {
            return false;
        }
        if (requestUriParameterSupported != null ? !requestUriParameterSupported.equals(that.requestUriParameterSupported) : that.requestUriParameterSupported != null) {
            return false;
        }
        if (requireRequestUriRegistration != null ? !requireRequestUriRegistration.equals(that.requireRequestUriRegistration) : that.requireRequestUriRegistration != null) {
            return false;
        }
        if (requestObjectSigningAlgValuesSupported != null ? !requestObjectSigningAlgValuesSupported.equals(that.requestObjectSigningAlgValuesSupported) : that.requestObjectSigningAlgValuesSupported != null) {
            return false;
        }
        if (serviceDocumentation != null ? !serviceDocumentation.equals(that.serviceDocumentation) : that.serviceDocumentation != null) {
            return false;
        }
        if (idTokenEncryptionEncValuesSupported != null ? !idTokenEncryptionEncValuesSupported.equals(that.idTokenEncryptionEncValuesSupported) : that.idTokenEncryptionEncValuesSupported != null) {
            return false;
        }
        if (displayValuesSupported != null ? !displayValuesSupported.equals(that.displayValuesSupported) : that.displayValuesSupported != null) {
            return false;
        }
        if (claimTypesSupported != null ? !claimTypesSupported.equals(that.claimTypesSupported) : that.claimTypesSupported != null) {
            return false;
        }
        if (claimsParameterSupported != null ? !claimsParameterSupported.equals(that.claimsParameterSupported) : that.claimsParameterSupported != null) {
            return false;
        }
        if (opTosUri != null ? !opTosUri.equals(that.opTosUri) : that.opTosUri != null) {
            return false;
        }
        if (opPolicyUri != null ? !opPolicyUri.equals(that.opPolicyUri) : that.opPolicyUri != null) {
            return false;
        }
        if (uriLocalesSupported != null ? !uriLocalesSupported.equals(that.uriLocalesSupported) : that.uriLocalesSupported != null) {
            return false;
        }
        if (claimsLocalesSupported != null ? !claimsLocalesSupported.equals(that.claimsLocalesSupported) : that.claimsLocalesSupported != null) {
            return false;
        }
        if (userinfoEncryptionAlgValuesSupported != null ? !userinfoEncryptionAlgValuesSupported.equals(that.userinfoEncryptionAlgValuesSupported) : that.userinfoEncryptionAlgValuesSupported != null) {
            return false;
        }
        if (userinfoEncryptionEncValuesSupported != null ? !userinfoEncryptionEncValuesSupported.equals(that.userinfoEncryptionEncValuesSupported) : that.userinfoEncryptionEncValuesSupported != null) {
            return false;
        }
        if (tokenEndpointAuthSigningAlgValuesSupported != null ? !tokenEndpointAuthSigningAlgValuesSupported.equals(that.tokenEndpointAuthSigningAlgValuesSupported) : that.tokenEndpointAuthSigningAlgValuesSupported != null) {
            return false;
        }
        if (requestObjectEncryptionAlgValuesSupported != null ? !requestObjectEncryptionAlgValuesSupported.equals(that.requestObjectEncryptionAlgValuesSupported) : that.requestObjectEncryptionAlgValuesSupported != null) {
            return false;
        }
        if (requestObjectEncryptionEncValuesSupported != null ? !requestObjectEncryptionEncValuesSupported.equals(that.requestObjectEncryptionEncValuesSupported) : that.requestObjectEncryptionEncValuesSupported != null) {
            return false;
        }
        return checkSessionIframe != null ? checkSessionIframe.equals(that.checkSessionIframe) : that.checkSessionIframe == null;
    }

    @Override
    public int hashCode() {
        int result = authorizationEndpoint != null ? authorizationEndpoint.hashCode() : 0;
        result = 31 * result + (idTokenSigningAlgValuesSupported != null ? idTokenSigningAlgValuesSupported.hashCode() : 0);
        result = 31 * result + (issuer != null ? issuer.hashCode() : 0);
        result = 31 * result + (jwksUri != null ? jwksUri.hashCode() : 0);
        result = 31 * result + (acrValuesSupported != null ? acrValuesSupported.hashCode() : 0);
        result = 31 * result + (responseTypesSupported != null ? responseTypesSupported.hashCode() : 0);
        result = 31 * result + (responseModesSupported != null ? responseModesSupported.hashCode() : 0);
        result = 31 * result + (scopesSupported != null ? scopesSupported.hashCode() : 0);
        result = 31 * result + (grantTypesSupported != null ? grantTypesSupported.hashCode() : 0);
        result = 31 * result + (subjectTypesSupported != null ? subjectTypesSupported.hashCode() : 0);
        result = 31 * result + (tokenEndpoint != null ? tokenEndpoint.hashCode() : 0);
        result = 31 * result + (tokenEndpointAuthMethodsSupported != null ? tokenEndpointAuthMethodsSupported.hashCode() : 0);
        result = 31 * result + (userinfoEndpoint != null ? userinfoEndpoint.hashCode() : 0);
        result = 31 * result + (registrationEndpoint != null ? registrationEndpoint.hashCode() : 0);
        result = 31 * result + (claimsSupported != null ? claimsSupported.hashCode() : 0);
        result = 31 * result + (codeChallengeMethodsSupported != null ? codeChallengeMethodsSupported.hashCode() : 0);
        result = 31 * result + (introspectionEndpoint != null ? introspectionEndpoint.hashCode() : 0);
        result = 31 * result + (introspectionEndpointAuthMethodsSupported != null ? introspectionEndpointAuthMethodsSupported.hashCode() : 0);
        result = 31 * result + (revocationEndpoint != null ? revocationEndpoint.hashCode() : 0);
        result = 31 * result + (revocationEndpointAuthMethodsSupported != null ? revocationEndpointAuthMethodsSupported.hashCode() : 0);
        result = 31 * result + (endSessionEndpoint != null ? endSessionEndpoint.hashCode() : 0);
        result = 31 * result + (requestParameterSupported != null ? requestParameterSupported.hashCode() : 0);
        result = 31 * result + (requestUriParameterSupported != null ? requestUriParameterSupported.hashCode() : 0);
        result = 31 * result + (requireRequestUriRegistration != null ? requireRequestUriRegistration.hashCode() : 0);
        result = 31 * result + (requestObjectSigningAlgValuesSupported != null ? requestObjectSigningAlgValuesSupported.hashCode() : 0);
        result = 31 * result + (serviceDocumentation != null ? serviceDocumentation.hashCode() : 0);
        result = 31 * result + (idTokenEncryptionEncValuesSupported != null ? idTokenEncryptionEncValuesSupported.hashCode() : 0);
        result = 31 * result + (displayValuesSupported != null ? displayValuesSupported.hashCode() : 0);
        result = 31 * result + (claimTypesSupported != null ? claimTypesSupported.hashCode() : 0);
        result = 31 * result + (claimsParameterSupported != null ? claimsParameterSupported.hashCode() : 0);
        result = 31 * result + (opTosUri != null ? opTosUri.hashCode() : 0);
        result = 31 * result + (opPolicyUri != null ? opPolicyUri.hashCode() : 0);
        result = 31 * result + (uriLocalesSupported != null ? uriLocalesSupported.hashCode() : 0);
        result = 31 * result + (claimsLocalesSupported != null ? claimsLocalesSupported.hashCode() : 0);
        result = 31 * result + (userinfoEncryptionAlgValuesSupported != null ? userinfoEncryptionAlgValuesSupported.hashCode() : 0);
        result = 31 * result + (userinfoEncryptionEncValuesSupported != null ? userinfoEncryptionEncValuesSupported.hashCode() : 0);
        result = 31 * result + (tokenEndpointAuthSigningAlgValuesSupported != null ? tokenEndpointAuthSigningAlgValuesSupported.hashCode() : 0);
        result = 31 * result + (requestObjectEncryptionAlgValuesSupported != null ? requestObjectEncryptionAlgValuesSupported.hashCode() : 0);
        result = 31 * result + (requestObjectEncryptionEncValuesSupported != null ? requestObjectEncryptionEncValuesSupported.hashCode() : 0);
        result = 31 * result + (checkSessionIframe != null ? checkSessionIframe.hashCode() : 0);
        return result;
    }
}
