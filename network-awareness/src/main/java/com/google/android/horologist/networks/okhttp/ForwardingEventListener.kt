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

package com.google.android.horologist.networks.okhttp

import okhttp3.Call
import okhttp3.Connection
import okhttp3.EventListener
import okhttp3.Handshake
import okhttp3.HttpUrl
import okhttp3.Protocol
import okhttp3.Request
import okhttp3.Response
import java.io.IOException
import java.net.InetAddress
import java.net.InetSocketAddress
import java.net.Proxy

/**
 * Forwarding implementation of EventListener to allow for easy overrides of particular events.
 */
public open class ForwardingEventListener(
    private val delegate: EventListener
) : EventListener() {
    override fun cacheConditionalHit(call: Call, cachedResponse: Response) {
        delegate.cacheConditionalHit(call, cachedResponse)
    }

    override fun cacheHit(call: Call, response: Response) {
        delegate.cacheHit(call, response)
    }

    override fun cacheMiss(call: Call) {
        delegate.cacheMiss(call)
    }

    override fun callEnd(call: Call) {
        delegate.callEnd(call)
    }

    override fun callFailed(call: Call, ioe: IOException) {
        delegate.callFailed(call, ioe)
    }

    override fun callStart(call: Call) {
        delegate.callStart(call)
    }

    override fun canceled(call: Call) {
        delegate.canceled(call)
    }

    override fun connectEnd(
        call: Call,
        inetSocketAddress: InetSocketAddress,
        proxy: Proxy,
        protocol: Protocol?
    ) {
        delegate.connectEnd(call, inetSocketAddress, proxy, protocol)
    }

    override fun connectFailed(
        call: Call,
        inetSocketAddress: InetSocketAddress,
        proxy: Proxy,
        protocol: Protocol?,
        ioe: IOException
    ) {
        delegate.connectFailed(call, inetSocketAddress, proxy, protocol, ioe)
    }

    override fun connectStart(call: Call, inetSocketAddress: InetSocketAddress, proxy: Proxy) {
        delegate.connectStart(call, inetSocketAddress, proxy)
    }

    override fun connectionAcquired(call: Call, connection: Connection) {
        delegate.connectionAcquired(call, connection)
    }

    override fun connectionReleased(call: Call, connection: Connection) {
        delegate.connectionReleased(call, connection)
    }

    override fun dnsEnd(call: Call, domainName: String, inetAddressList: List<InetAddress>) {
        delegate.dnsEnd(call, domainName, inetAddressList)
    }

    override fun dnsStart(call: Call, domainName: String) {
        delegate.dnsStart(call, domainName)
    }

    override fun proxySelectEnd(call: Call, url: HttpUrl, proxies: List<Proxy>) {
        delegate.proxySelectEnd(call, url, proxies)
    }

    override fun proxySelectStart(call: Call, url: HttpUrl) {
        delegate.proxySelectStart(call, url)
    }

    override fun requestBodyEnd(call: Call, byteCount: Long) {
        delegate.requestBodyEnd(call, byteCount)
    }

    override fun requestBodyStart(call: Call) {
        delegate.requestBodyStart(call)
    }

    override fun requestFailed(call: Call, ioe: IOException) {
        delegate.requestFailed(call, ioe)
    }

    override fun requestHeadersEnd(call: Call, request: Request) {
        delegate.requestHeadersEnd(call, request)
    }

    override fun requestHeadersStart(call: Call) {
        delegate.requestHeadersStart(call)
    }

    override fun responseBodyEnd(call: Call, byteCount: Long) {
        delegate.responseBodyEnd(call, byteCount)
    }

    override fun responseBodyStart(call: Call) {
        delegate.responseBodyStart(call)
    }

    override fun responseFailed(call: Call, ioe: IOException) {
        delegate.responseFailed(call, ioe)
    }

    override fun responseHeadersEnd(call: Call, response: Response) {
        delegate.responseHeadersEnd(call, response)
    }

    override fun responseHeadersStart(call: Call) {
        delegate.responseHeadersStart(call)
    }

    override fun satisfactionFailure(call: Call, response: Response) {
        delegate.satisfactionFailure(call, response)
    }

    override fun secureConnectEnd(call: Call, handshake: Handshake?) {
        delegate.secureConnectEnd(call, handshake)
    }

    override fun secureConnectStart(call: Call) {
        delegate.secureConnectStart(call)
    }
}
