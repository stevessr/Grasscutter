package emu.grasscutter.game.activity.condition;

import emu.grasscutter.data.excels.ActivityCondExcelConfigData;
import emu.grasscutter.game.activity.PlayerActivityData;
import emu.grasscutter.game.player.Player;

/**
 * Base handler for all activity conditions that are listed in NewActivityCondExcelConfigData.json ({@link ActivityCondExcelConfigData})
 */
public abstract class ActivityConditionBaseHandler {

    /**
     * Execute activity condition handler and return result of it's calculation
     *
     * @param activityData {@link PlayerActivityData} object containing info about activity
     * @param params       params for handler
     * @return result of condition calculation
     */
    public abstract boolean execute(PlayerActivityData activityData, int... params);
}
