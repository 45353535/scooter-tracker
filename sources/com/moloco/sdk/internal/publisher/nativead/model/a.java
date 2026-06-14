package com.moloco.sdk.internal.publisher.nativead.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f54961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f54962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f54963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f54964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f54965f;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0672a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f54967b;

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$a$a, reason: collision with other inner class name */
        public static final class C0673a extends AbstractC0672a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Integer f54968c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Integer f54969d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f54970e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0673a(int i10, boolean z10, Integer num, Integer num2, String value) {
                super(i10, z10, null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.f54968c = num;
                this.f54969d = num2;
                this.f54970e = value;
            }

            public final String c() {
                return this.f54970e;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$a$b */
        public static final class b extends AbstractC0672a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Integer f54971c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f54972d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Integer f54973e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final Integer f54974f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i10, boolean z10, Integer num, String url, Integer num2, Integer num3) {
                super(i10, z10, null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.f54971c = num;
                this.f54972d = url;
                this.f54973e = num2;
                this.f54974f = num3;
            }

            public final String c() {
                return this.f54972d;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$a$c */
        public static final class c extends AbstractC0672a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f54975c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Integer f54976d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(int i10, boolean z10, String text, Integer num) {
                super(i10, z10, null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.f54975c = text;
                this.f54976d = num;
            }

            public final String c() {
                return this.f54975c;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$a$d */
        public static final class d extends AbstractC0672a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f54977c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(int i10, boolean z10, String vastTag) {
                super(i10, z10, null);
                Intrinsics.checkNotNullParameter(vastTag, "vastTag");
                this.f54977c = vastTag;
            }

            public final String c() {
                return this.f54977c;
            }
        }

        public /* synthetic */ AbstractC0672a(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, z10);
        }

        public final int a() {
            return this.f54966a;
        }

        public final boolean b() {
            return this.f54967b;
        }

        public AbstractC0672a(int i10, boolean z10) {
            this.f54966a = i10;
            this.f54967b = z10;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f54979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f54980c;

        public b(int i10, int i11, String str) {
            this.f54978a = i10;
            this.f54979b = i11;
            this.f54980c = str;
        }

        public final int a() {
            return this.f54978a;
        }

        public final int b() {
            return this.f54979b;
        }

        public final String c() {
            return this.f54980c;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f54981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f54982b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f54983c;

        public c(String url, List clickTrackerUrls, String str) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(clickTrackerUrls, "clickTrackerUrls");
            this.f54981a = url;
            this.f54982b = clickTrackerUrls;
            this.f54983c = str;
        }

        public final List a() {
            return this.f54982b;
        }

        public final String b() {
            return this.f54981a;
        }
    }

    public a(String str, List assets, c cVar, List impressionTrackerUrls, List eventTrackers, String str2) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(impressionTrackerUrls, "impressionTrackerUrls");
        Intrinsics.checkNotNullParameter(eventTrackers, "eventTrackers");
        this.f54960a = str;
        this.f54961b = assets;
        this.f54962c = cVar;
        this.f54963d = impressionTrackerUrls;
        this.f54964e = eventTrackers;
        this.f54965f = str2;
    }

    public final List a() {
        return this.f54961b;
    }

    public final List b() {
        return this.f54964e;
    }

    public final List c() {
        return this.f54963d;
    }

    public final c d() {
        return this.f54962c;
    }
}
