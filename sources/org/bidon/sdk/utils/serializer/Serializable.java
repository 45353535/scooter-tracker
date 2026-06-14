package org.bidon.sdk.utils.serializer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lorg/bidon/sdk/utils/serializer/Serializable;", "", "Error", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Serializable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/utils/serializer/Serializable$Error;", "", "<init>", "()V", "UnknownClass", "NotAnnotatedField", "Lorg/bidon/sdk/utils/serializer/Serializable$Error$NotAnnotatedField;", "Lorg/bidon/sdk/utils/serializer/Serializable$Error$UnknownClass;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Error extends Throwable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/utils/serializer/Serializable$Error$NotAnnotatedField;", "Lorg/bidon/sdk/utils/serializer/Serializable$Error;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NotAnnotatedField extends Error {

            @NotNull
            public static final NotAnnotatedField INSTANCE = new NotAnnotatedField();

            private NotAnnotatedField() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/bidon/sdk/utils/serializer/Serializable$Error$UnknownClass;", "Lorg/bidon/sdk/utils/serializer/Serializable$Error;", "<init>", "()V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class UnknownClass extends Error {

            @NotNull
            public static final UnknownClass INSTANCE = new UnknownClass();

            private UnknownClass() {
                super(null);
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }
}
