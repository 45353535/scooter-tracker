package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class w {

    public static final class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f57295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f57296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f57297c;

        public /* synthetic */ a(boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z10, i10, i11);
        }

        public final int a() {
            return this.f57297c;
        }

        public final boolean b() {
            return this.f57295a;
        }

        public final int c() {
            return this.f57296b;
        }

        public a(boolean z10, int i10, int i11) {
            super(null);
            this.f57295a = z10;
            this.f57296b = i10;
            this.f57297c = i11;
        }
    }

    public static final class b extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Painter f57298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f57299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f57300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Shape f57301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f57302e;

        public /* synthetic */ b(Painter painter, String str, long j10, Shape shape, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(painter, str, j10, shape, j11);
        }

        public final long a() {
            return this.f57302e;
        }

        public final Shape b() {
            return this.f57301d;
        }

        public final String c() {
            return this.f57299b;
        }

        public final long d() {
            return this.f57300c;
        }

        public final Painter e() {
            return this.f57298a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Painter painter, String str, long j10, Shape backgroundShape, long j11) {
            super(null);
            Intrinsics.checkNotNullParameter(painter, "painter");
            Intrinsics.checkNotNullParameter(backgroundShape, "backgroundShape");
            this.f57298a = painter;
            this.f57299b = str;
            this.f57300c = j10;
            this.f57301d = backgroundShape;
            this.f57302e = j11;
        }
    }

    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public w() {
    }
}
