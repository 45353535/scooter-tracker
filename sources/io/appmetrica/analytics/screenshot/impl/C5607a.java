package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.C5607a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5607a extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5610d f78996a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5607a(C5610d c5610d) {
        super(0);
        this.f78996a = c5610d;
    }

    public static final void a(C5610d c5610d) {
        ((C5629x) c5610d.f79002b).a("AndroidApiScreenshotCaptor");
    }

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        final C5610d c5610d = this.f78996a;
        return new Activity.ScreenCaptureCallback() { // from class: s8.a
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C5607a.a(c5610d);
            }
        };
    }
}
