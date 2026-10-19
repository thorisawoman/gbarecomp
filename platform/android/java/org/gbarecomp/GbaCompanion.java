package org.gbarecomp;

import android.app.Activity;

/**
 * Optional per-game extension of the game Activity (for example a second-
 * screen UI on dual-display devices). The game names its implementation in
 * `gbaGame.companion`; GbaGameActivity instantiates it by reflection and
 * forwards these lifecycle calls on the UI thread.
 */
public interface GbaCompanion {
    void onCreate(Activity activity);
    default void onResume() {}
    default void onPause() {}
    default void onDestroy() {}
}
