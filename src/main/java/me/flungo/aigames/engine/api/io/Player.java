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
package me.flungo.aigames.engine.api.io;

import java.io.IOException;

/**
 *
 * @author Fabrizio Lungo <fab@lungo.co.uk>
 */
public interface Player extends Runnable {

    /**
     * Ends the bot process and it's communication
     *
     */
    void finish();

    /**
     * Waits for a response from the bot
     *
     * @param timeOut maximum time in milliseconds to wait for a response
     * @return the response from the player
     */
    String getResponse(long timeOut);

    /**
     * Processes a line by reading it or writing it
     *
     * @param line the line to process
     * @param type the type of the line "input", "output" or "error"
     * @throws IOException exception communicating with bot
     */
    void process(String line, String type) throws IOException;

}