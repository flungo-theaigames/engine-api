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
public interface Engine {

    /**
     * Sets the game logic.
     *
     * @param logic the {@link Logic} to use for the game.
     */
    void setLogic(Logic logic);

    /**
     * Determines whether game has ended.
     *
     * @return true if the game has ended, false otherwise.
     */
    boolean hasEnded();

    /**
     * @return the current {@link EngineState} of the {@link Engine}.
     */
    EngineState getState();

    /**
     * Method to start engine. Runs the game loop, until the game has ended.
     * State should be ready before running.
     *
     * @throws IllegalStateException thrown if engine is not in the
     * {@link EngineState#READY} state before being called. The existing state
     * of the {@link Engine} will not be modified and no changes will be made
     * within any of the components. The method can be run again, once the
     * {@link Engine} has entered the {@link EngineState#READY} state.
     * @throws EngineRuntimeException thrown when an exception has occurred
     * during the runtime loop of the {@link Engine}. The {@link EngineState}
     * will become {@link EngineState#FAILED} after the loop has ended with this
     * exception.
     */
    void start() throws IllegalStateException, EngineRuntimeException;

}
