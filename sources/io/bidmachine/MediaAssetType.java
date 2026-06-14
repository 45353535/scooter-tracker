package io.bidmachine;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 io.bidmachine.MediaAssetType, still in use, count: 1, list:
  (r0v0 io.bidmachine.MediaAssetType) from 0x0001: FILLED_NEW_ARRAY (r0v0 io.bidmachine.MediaAssetType), (r1v1 io.bidmachine.MediaAssetType) A[WRAPPED] (LINE:2) elemType: java.lang.Object
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes12.dex */
public final class MediaAssetType {
    Icon,
    Image,
    Video,
    All;


    @NonNull
    public static final List<MediaAssetType> DEFAULT = m4.a(new Object[]{new MediaAssetType(), new MediaAssetType()});

    static {
    }

    private MediaAssetType() {
    }

    public static boolean isAll(@NonNull List<MediaAssetType> list) {
        if (list.contains(All)) {
            return true;
        }
        return list.contains(Icon) && list.contains(Image) && list.contains(Video);
    }

    public static MediaAssetType valueOf(String str) {
        return (MediaAssetType) Enum.valueOf(MediaAssetType.class, str);
    }

    public static MediaAssetType[] values() {
        return (MediaAssetType[]) $VALUES.clone();
    }
}
