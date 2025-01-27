/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.horologist.mediasample.ui.navigation

import androidx.navigation.NavController
import com.google.android.horologist.media.ui.navigation.NavigationScreens

public fun NavController.navigateToAudioDebug() {
    navigate(AudioDebug.destination())
}

public object AudioDebug : NavigationScreens("audioDebug") {
    public fun destination(): String = navRoute
}

public fun NavController.navigateToSamples() {
    navigate(Samples.destination())
}

public object Samples : NavigationScreens("samples") {
    public fun destination(): String = navRoute
}

public fun NavController.navigateToDeveloperOptions() {
    navigate(DeveloperOptions.destination())
}

public object DeveloperOptions : NavigationScreens("developerOptions") {
    public fun destination(): String = navRoute
}
