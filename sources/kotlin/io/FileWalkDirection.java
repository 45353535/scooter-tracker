package kotlin.io;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/FileWalkDirection;", "", "<init>", "(Ljava/lang/String;I)V", "b", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileWalkDirection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FileWalkDirection f93275b = new FileWalkDirection("TOP_DOWN", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FileWalkDirection f93276c = new FileWalkDirection("BOTTOM_UP", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ FileWalkDirection[] f93277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f93278e;

    static {
        FileWalkDirection[] fileWalkDirectionArrD = d();
        f93277d = fileWalkDirectionArrD;
        f93278e = a.a(fileWalkDirectionArrD);
    }

    private FileWalkDirection(String str, int i10) {
    }

    private static final /* synthetic */ FileWalkDirection[] d() {
        return new FileWalkDirection[]{f93275b, f93276c};
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f93277d.clone();
    }
}
