/*
 * Copyright (C) 2015 Fabrizio Lungo <fab@lungo.co.uk> - All Rights Reserved
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * Created by Fabrizio Lungo <fab@lungo.co.uk>, April 2015
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
     * @param logic the logic to use for the game.
     */
    void setLogic(Logic logic);

    /**
     * Determines whether game has ended.
     *
     * @return true if the game has ended, false otherwise.
     */
    boolean hasEnded();

    /**
     * Method to start engine. Runs the game loop, until the game has ended.
     *
     * @throws Exception
     */
    void start() throws Exception;

}
