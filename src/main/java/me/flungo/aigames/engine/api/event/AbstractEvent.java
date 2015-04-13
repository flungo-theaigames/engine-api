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
package me.flungo.aigames.engine.api.event;

import me.flungo.aigames.engine.api.Engine;

/**
 *
 * @author Fabrizio Lungo <fab@lungo.co.uk>
 */
public abstract class AbstractEvent implements Event {

    private final Engine engine;
    private final long time;

    public AbstractEvent(Engine engine) {
        this(engine, System.currentTimeMillis());
    }

    public AbstractEvent(Engine engine, long time) {
        this.engine = engine;
        this.time = time;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public long getTimeInMillis() {
        return time;
    }

}
