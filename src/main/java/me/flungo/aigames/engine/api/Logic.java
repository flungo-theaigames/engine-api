/*
 * Copyright 2015 theaigames.com <developers@theaigames.com>.
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

import java.util.ArrayList;
import me.flungo.aigames.engine.api.io.Player;

/**
 * Logic interface
 *
 * Interface to implement when creating games.
 *
 * @author Jackie Xu <jackie@starapple.nl>, Jim van Eeden <jim@starapple.nl>
 */
public interface Logic {

    public void setupGame(ArrayList<Player> players) throws Exception;

    public void playRound(int roundNumber) throws Exception;

    public boolean isGameWon();

    public void finish() throws Exception;
}
