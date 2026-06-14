package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/google/firebase/sessions/EventType;", "Lcom/google/firebase/encoders/json/NumberedEnum;", "", "", "number", "<init>", "(Ljava/lang/String;II)V", "b", "I", "getNumber", "()I", "EVENT_TYPE_UNKNOWN", "SESSION_START", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EventType implements NumberedEnum {
    public static final EventType EVENT_TYPE_UNKNOWN = new EventType("EVENT_TYPE_UNKNOWN", 0, 0);
    public static final EventType SESSION_START = new EventType("SESSION_START", 1, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EventType[] f33274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f33275d;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int number;

    static {
        EventType[] eventTypeArrD = d();
        f33274c = eventTypeArrD;
        f33275d = qf.a.a(eventTypeArrD);
    }

    private EventType(String str, int i10, int i11) {
        this.number = i11;
    }

    private static final /* synthetic */ EventType[] d() {
        return new EventType[]{EVENT_TYPE_UNKNOWN, SESSION_START};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f33275d;
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) f33274c.clone();
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    public int getNumber() {
        return this.number;
    }
}
