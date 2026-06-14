package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@CheckReturnValue
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f4557id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int i10, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        this.f4557id = i10;
        this.caseField = field;
        this.valueField = field2;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f4557id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
