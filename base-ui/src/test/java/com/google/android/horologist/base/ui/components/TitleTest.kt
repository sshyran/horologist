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

@file:OptIn(
    ExperimentalHorologistPaparazziApi::class,
    ExperimentalHorologistBaseUiApi::class,
    ExperimentalHorologistComposeToolsApi::class
)

package com.google.android.horologist.base.ui.components

import com.google.android.horologist.base.ui.ExperimentalHorologistBaseUiApi
import com.google.android.horologist.compose.tools.ExperimentalHorologistComposeToolsApi
import com.google.android.horologist.compose.tools.snapshotInABox
import com.google.android.horologist.paparazzi.ExperimentalHorologistPaparazziApi
import com.google.android.horologist.paparazzi.WearPaparazzi
import org.junit.Rule
import org.junit.Test

class TitleTest {

    @get:Rule
    val paparazzi = WearPaparazzi(
        maxPercentDifference = 0.0
    )

    @Test
    fun default() {
        paparazzi.snapshotInABox {
            Title("Title")
        }
    }

    @Test
    fun withVeryLongText() {
        paparazzi.snapshotInABox {
            Title("Title with a very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very very long text")
        }
    }
}
