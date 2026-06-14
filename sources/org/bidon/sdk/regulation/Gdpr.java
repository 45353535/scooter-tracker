package org.bidon.sdk.regulation;

import androidx.webkit.Profile;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lorg/bidon/sdk/regulation/Gdpr;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "Unknown", "DoesNotApply", "Applies", y.f66058y, "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Gdpr {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Gdpr[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int code;
    public static final Gdpr Unknown = new Gdpr("Unknown", 0, -1);
    public static final Gdpr DoesNotApply = new Gdpr("DoesNotApply", 1, 0);
    public static final Gdpr Applies = new Gdpr("Applies", 2, 1);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/regulation/Gdpr$Companion;", "", "<init>", "()V", Profile.DEFAULT_PROFILE_NAME, "Lorg/bidon/sdk/regulation/Gdpr;", "getDefault", "()Lorg/bidon/sdk/regulation/Gdpr;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Gdpr getDefault() {
            return Gdpr.Unknown;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Gdpr[] $values() {
        return new Gdpr[]{Unknown, DoesNotApply, Applies};
    }

    static {
        Gdpr[] gdprArr$values = $values();
        $VALUES = gdprArr$values;
        $ENTRIES = a.a(gdprArr$values);
        INSTANCE = new Companion(null);
    }

    private Gdpr(String str, int i10, int i11) {
        this.code = i11;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Gdpr valueOf(String str) {
        return (Gdpr) Enum.valueOf(Gdpr.class, str);
    }

    public static Gdpr[] values() {
        return (Gdpr[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
