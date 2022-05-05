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

@file:OptIn(ExperimentalMediaUiApi::class)

package com.google.android.horologist.media.ui.components.controls

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.horologist.media.ui.ExperimentalMediaUiApi

@Preview(name = "5 seconds increment - Enabled")
@Composable
fun SeekBackButtonPreview5() {
    SeekBackButton(
        onClick = {},
        seekButtonIncrement = SeekButtonIncrement.Five,
    )
}

@Preview(name = "10 seconds increment - Disabled")
@Composable
fun SeekBackButtonPreview10() {
    SeekBackButton(
        onClick = {},
        seekButtonIncrement = SeekButtonIncrement.Ten,
        enabled = false
    )
}

@Preview(name = "30 seconds increment - Enabled")
@Composable
fun SeekBackButtonPreview30() {
    SeekBackButton(
        onClick = {},
        seekButtonIncrement = SeekButtonIncrement.Thirty,
    )
}

@Preview(name = "Other amount of seconds increment - Disabled")
@Composable
fun SeekBackButtonPreviewOther() {
    SeekBackButton(
        onClick = {},
        seekButtonIncrement = SeekButtonIncrement.Other(15),
        enabled = false
    )
}

@Preview(name = "Unknown amount of seconds increment - Enabled")
@Composable
fun SeekBackButtonPreviewUnknown() {
    SeekBackButton(
        onClick = {},
        seekButtonIncrement = SeekButtonIncrement.Unknown,
    )
}