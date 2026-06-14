package f1;

import android.content.Context;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.source.MediaSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f71618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f71619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f71620c;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ y3 f71621f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y3 y3Var) {
            super(0);
            this.f71621f = y3Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final MediaSource.Factory invoke() {
            return td.h(this.f71621f.c());
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f71622f = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final LoadControl invoke() {
            return td.b(0, 0, 3, null);
        }
    }

    public y5(Context context, y3 downloadManager, Function0 mediaSourceFactory, Function0 loadControlFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(mediaSourceFactory, "mediaSourceFactory");
        Intrinsics.checkNotNullParameter(loadControlFactory, "loadControlFactory");
        this.f71618a = mediaSourceFactory;
        this.f71619b = loadControlFactory;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f71620c = applicationContext;
    }

    public final ExoPlayer a() {
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(this.f71620c).setMediaSourceFactory((MediaSource.Factory) this.f71618a.invoke()).setLoadControl((LoadControl) this.f71619b.invoke()).build();
        Intrinsics.checkNotNullExpressionValue(exoPlayerBuild, "build(...)");
        return exoPlayerBuild;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ y5(Context context, y3 y3Var, Function0 function0, Function0 function02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        y3Var = (i10 & 2) != 0 ? rd.f70996b.a().d() : y3Var;
        this(context, y3Var, (i10 & 4) != 0 ? new a(y3Var) : function0, (i10 & 8) != 0 ? b.f71622f : function02);
    }
}
