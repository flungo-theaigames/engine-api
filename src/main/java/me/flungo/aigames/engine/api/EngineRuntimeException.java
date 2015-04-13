/*
 * Copyright 2015 Fabrizio Lungo <fab@lungo.co.uk>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.flungo.aigames.engine.api;

/**
 *
 * @author Fabrizio Lungo <fab@lungo.co.uk>
 */
public class EngineRuntimeException extends RuntimeException {

    /**
     * Constructs an instance of <code>EngineRuntimeException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EngineRuntimeException(String msg) {
        super(msg);
    }

    /**
     * Constructs an instance of <code>EngineRuntimeException</code> with the
     * specified detail message and the causing {@link Throwable}.
     *
     * @param msg the detail message.
     * @param cause the {@link Throwable} that caused the exception.
     */
    public EngineRuntimeException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
