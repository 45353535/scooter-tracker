package v2;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f105730c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f105731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f105732b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(s.m()).edit();
            editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            editorEdit.apply();
        }

        public final p b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(s.m());
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return new p(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), defaultConstructorMarker);
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ p(String str, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10);
    }

    public final void a() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(s.m()).edit();
        editorEdit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f105731a);
        editorEdit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f105732b);
        editorEdit.apply();
    }

    public String toString() {
        String str = this.f105732b ? "Applink" : "Unclassified";
        if (this.f105731a == null) {
            return str;
        }
        return str + '(' + this.f105731a + ')';
    }

    private p(String str, boolean z10) {
        this.f105731a = str;
        this.f105732b = z10;
    }
}
