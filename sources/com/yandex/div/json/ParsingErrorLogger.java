package com.yandex.div.json;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public interface ParsingErrorLogger {
    public static final ParsingErrorLogger LOG = new ParsingErrorLogger() { // from class: e8.a
        @Override // com.yandex.div.json.ParsingErrorLogger
        public final void logError(Exception exc) {
            c.b(exc);
        }

        @Override // com.yandex.div.json.ParsingErrorLogger
        public /* synthetic */ void logTemplateError(Exception exc, String str) {
            c.a(this, exc, str);
        }
    };
    public static final ParsingErrorLogger ASSERT = new ParsingErrorLogger() { // from class: e8.b
        @Override // com.yandex.div.json.ParsingErrorLogger
        public final void logError(Exception exc) {
            c.c(exc);
        }

        @Override // com.yandex.div.json.ParsingErrorLogger
        public /* synthetic */ void logTemplateError(Exception exc, String str) {
            c.a(this, exc, str);
        }
    };

    void logError(@NonNull Exception exc);

    void logTemplateError(@NonNull Exception exc, @NonNull String str);
}
