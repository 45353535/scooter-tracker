package androidx.compose.ui.platform;

import androidx.compose.ui.text.AnnotatedString;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class t {
    public static boolean a(ClipboardManager clipboardManager) {
        AnnotatedString text = clipboardManager.getText();
        return text != null && text.length() > 0;
    }
}
