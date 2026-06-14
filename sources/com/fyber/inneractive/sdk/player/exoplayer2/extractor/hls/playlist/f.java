package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedReader f21943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Queue f21944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21945c;

    public f(LinkedList linkedList, BufferedReader bufferedReader) {
        this.f21944b = linkedList;
        this.f21943a = bufferedReader;
    }

    public final boolean a() throws IOException {
        String strTrim;
        if (this.f21945c != null) {
            return true;
        }
        if (!this.f21944b.isEmpty()) {
            this.f21945c = (String) this.f21944b.poll();
            return true;
        }
        do {
            String line = this.f21943a.readLine();
            this.f21945c = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.f21945c = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }
}
