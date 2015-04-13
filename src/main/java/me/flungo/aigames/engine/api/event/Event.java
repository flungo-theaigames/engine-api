/*
 * Copyright (C) 2015 Fabrizio Lungo <fab@lungo.co.uk> - All Rights Reserved
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * Created by Fabrizio Lungo <fab@lungo.co.uk>, April 2015
 */
package me.flungo.aigames.engine.api.event;

import me.flungo.aigames.engine.api.Engine;

/**
 *
 * @author Fabrizio Lungo <fab@lungo.co.uk>
 */
public interface Event {

    /**
     *
     * @return The Engine where the event has originated from
     */
    Engine getEngine();

    /**
     *
     * @return The time in milliseconds since the epoch at which the event
     * occurred.
     */
    long getTimeInMillis();

}
