package yads;

import com.mobilefuse.sdk.config.ExternalUsageInfo;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class td2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ td2[] f116210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f116211d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f116212b;

    static {
        td2[] td2VarArr = {new td2("Flutter", 0, CollectionsKt.listOf("io.flutter.embedding.android.FlutterActivity")), new td2("ReactNative", 1, CollectionsKt.listOf("com.facebook.react.bridge.ReactContext")), new td2(ExternalUsageInfo.SDK_MODULE_UNITY, 2, CollectionsKt.listOf((Object[]) new String[]{MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME, "com.unity3d.player.UnityPlayerActivity"}))};
        f116210c = td2VarArr;
        f116211d = qf.a.a(td2VarArr);
    }

    public td2(String str, int i10, List list) {
        this.f116212b = list;
    }

    public static td2 valueOf(String str) {
        return (td2) Enum.valueOf(td2.class, str);
    }

    public static td2[] values() {
        return (td2[]) f116210c.clone();
    }
}
