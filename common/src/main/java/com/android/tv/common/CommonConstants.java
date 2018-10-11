/*
 * Copyright 2015 The Android Open Source Project
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

package com.android.tv.common;

import android.os.Build;
import android.util.Log;

/** Constants for common use in apps and tests. */
public final class CommonConstants {

    public static final String BASE_PACKAGE = isAOSP() ? "com.android.tv" :
                    "com.google.android.tv";
    /** A constant for the key of the extra data for the app linking intent. */
    public static final String EXTRA_APP_LINK_CHANNEL_URI = "app_link_channel_uri";

    private CommonConstants() {}


    public static boolean isAOSP() {
        Log.d(CommonConstants.class.getSimpleName(), "isAOSP" + Build.HOST);
        return Build.HOST.endsWith(".google.com");
    }

}
