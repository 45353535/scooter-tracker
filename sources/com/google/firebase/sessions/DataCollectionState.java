package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/firebase/sessions/DataCollectionState;", "Lcom/google/firebase/encoders/json/NumberedEnum;", "", "", "number", "<init>", "(Ljava/lang/String;II)V", "b", "I", "getNumber", "()I", "COLLECTION_UNKNOWN", "COLLECTION_SDK_NOT_INSTALLED", "COLLECTION_ENABLED", "COLLECTION_DISABLED", "COLLECTION_DISABLED_REMOTE", "COLLECTION_SAMPLED", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataCollectionState implements NumberedEnum {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ DataCollectionState[] f33266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f33267d;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int number;
    public static final DataCollectionState COLLECTION_UNKNOWN = new DataCollectionState("COLLECTION_UNKNOWN", 0, 0);
    public static final DataCollectionState COLLECTION_SDK_NOT_INSTALLED = new DataCollectionState("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
    public static final DataCollectionState COLLECTION_ENABLED = new DataCollectionState("COLLECTION_ENABLED", 2, 2);
    public static final DataCollectionState COLLECTION_DISABLED = new DataCollectionState("COLLECTION_DISABLED", 3, 3);
    public static final DataCollectionState COLLECTION_DISABLED_REMOTE = new DataCollectionState("COLLECTION_DISABLED_REMOTE", 4, 4);
    public static final DataCollectionState COLLECTION_SAMPLED = new DataCollectionState("COLLECTION_SAMPLED", 5, 5);

    static {
        DataCollectionState[] dataCollectionStateArrD = d();
        f33266c = dataCollectionStateArrD;
        f33267d = qf.a.a(dataCollectionStateArrD);
    }

    private DataCollectionState(String str, int i10, int i11) {
        this.number = i11;
    }

    private static final /* synthetic */ DataCollectionState[] d() {
        return new DataCollectionState[]{COLLECTION_UNKNOWN, COLLECTION_SDK_NOT_INSTALLED, COLLECTION_ENABLED, COLLECTION_DISABLED, COLLECTION_DISABLED_REMOTE, COLLECTION_SAMPLED};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f33267d;
    }

    public static DataCollectionState valueOf(String str) {
        return (DataCollectionState) Enum.valueOf(DataCollectionState.class, str);
    }

    public static DataCollectionState[] values() {
        return (DataCollectionState[]) f33266c.clone();
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    public int getNumber() {
        return this.number;
    }
}
