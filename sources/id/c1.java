package id;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum c1 implements pd.p {
    None("none"),
    ToFill("to_fill"),
    AspectFill("aspect_fill"),
    AspectFit("aspect_fit");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f74400c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74406b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    c1(String str) {
        this.f74406b = str;
    }

    @Override // pd.p
    public String getKey() {
        return this.f74406b;
    }
}
