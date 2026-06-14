package sg.bigo.ads.api.core;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final b f102174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.a.l f102175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.b f102176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.common.g f102177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f102178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f102179f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public sg.bigo.ads.common.g f102180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final b f102181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        private final sg.bigo.ads.api.a.l f102182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        private final sg.bigo.ads.api.b f102183d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        private final Context f102184e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Context f102185f;

        public a(@NonNull b bVar, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull sg.bigo.ads.api.b bVar2, @NonNull Context context, @NonNull Context context2) {
            this.f102181b = bVar;
            this.f102182c = lVar;
            this.f102183d = bVar2;
            this.f102184e = context;
            this.f102185f = context2;
        }

        public final f a() {
            f fVar = new f(this.f102181b, this.f102182c, this.f102183d, this.f102184e, this.f102185f, (byte) 0);
            fVar.f102177d = this.f102180a;
            return fVar;
        }
    }

    private f(@NonNull b bVar, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull sg.bigo.ads.api.b bVar2, @NonNull Context context, @NonNull Context context2) {
        this.f102174a = bVar;
        this.f102175b = lVar;
        this.f102176c = bVar2;
        this.f102178e = context;
        this.f102179f = context2;
    }

    public final f a(b bVar) {
        f fVar = new f(bVar, this.f102175b, this.f102176c, this.f102178e, this.f102179f);
        fVar.f102177d = this.f102177d;
        return fVar;
    }

    /* synthetic */ f(b bVar, sg.bigo.ads.api.a.l lVar, sg.bigo.ads.api.b bVar2, Context context, Context context2, byte b10) {
        this(bVar, lVar, bVar2, context, context2);
    }
}
