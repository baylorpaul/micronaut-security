/*
 * Copyright 2017-2023 original authors
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
package io.micronaut.security.token.validator;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.order.Ordered;
import io.micronaut.security.authentication.Authentication;
import org.reactivestreams.Publisher;

/**
 * Responsible for token validation and claims retrieval.
 *
 * @author Sergio del Amo
 * @param <T> Request
 * @since 1.0
 */
public interface TokenValidator<T> extends Ordered {

    /**
     * Validates the provided token and returns the authentication state.
     *
     * @param token The token string
     * @param request The current request (or null)
     * @return An authentication publisher. If the publisher emits an error, no further validators will
     * be attempted and the validation will fail. If the publisher is empty, further validators will be
     * attempted. If the publisher emits an authentication, that authentication will be used.
     */
    Publisher<Authentication> validateToken(String token,
                                            @Nullable T request);
}
