/*
 * Copyright 2015 theaigames.com <developers@theaigames.com>,
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
public enum EngineState {

    /**
     * {@link Engine} has been instantiated but no {@link Logic} has been given
     * for the {@link Engine}.
     */
    INSTANTIATED,
    /**
     * {@link Engine} has a valid {@link Logic} but has not been started.
     */
    READY,
    /**
     * {@link Engine} has been started but the game has not ended.
     */
    RUNNING,
    /**
     * {@link Engine} has ended successfully with the {@link Logic} declaring
     * that the game is over.
     */
    STOPPED,
    /**
     * {@link Engine} has ended unsuccessfully with the {@link Logic} stating
     * the game has not ended. This usually occurs after an exception has been
     * thrown in the engine runtime loop.
     */
    FAILED
}
