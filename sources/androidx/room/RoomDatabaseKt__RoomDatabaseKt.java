package androidx.room;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a<\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\"\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086@¢\u0006\u0002\u0010\b\u001a<\u0010\t\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\"\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086@¢\u0006\u0002\u0010\b\u001a$\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u0014\u0010\u0013\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¨\u0006\u0014"}, d2 = {"useReaderConnection", "R", "Landroidx/room/RoomDatabase;", "block", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "useWriterConnection", "validateMigrationsNotRequired", "", "migrationStartAndEndVersions", "", "", "migrationsNotRequiredFrom", "validateAutoMigrations", "configuration", "Landroidx/room/DatabaseConfiguration;", "validateTypeConverters", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/RoomDatabaseKt")
final /* synthetic */ class RoomDatabaseKt__RoomDatabaseKt {

    /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt", f = "RoomDatabase.kt", l = {471, 471}, m = "useReaderConnection")
    static final class AnonymousClass1<R> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomDatabaseKt.useReaderConnection(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2", f = "RoomDatabase.kt", l = {472}, m = "invokeSuspend")
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<Transactor, Continuation, Object> $block;
        final /* synthetic */ RoomDatabase $this_useReaderConnection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(RoomDatabase roomDatabase, Function2<? super Transactor, ? super Continuation, ? extends Object> function2, Continuation continuation) {
            super(2, continuation);
            this.$this_useReaderConnection = roomDatabase;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$this_useReaderConnection, this.$block, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            RoomDatabase roomDatabase = this.$this_useReaderConnection;
            Function2<Transactor, Continuation, Object> function2 = this.$block;
            this.label = 1;
            Object objUseConnection = roomDatabase.useConnection(true, function2, this);
            return objUseConnection == objG ? objG : objUseConnection;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt", f = "RoomDatabase.kt", l = {501, 501}, m = "useWriterConnection")
    static final class C16611<R> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C16611(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomDatabaseKt.useWriterConnection(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2", f = "RoomDatabase.kt", l = {502}, m = "invokeSuspend")
    static final class C16622 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<Transactor, Continuation, Object> $block;
        final /* synthetic */ RoomDatabase $this_useWriterConnection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C16622(RoomDatabase roomDatabase, Function2<? super Transactor, ? super Continuation, ? extends Object> function2, Continuation continuation) {
            super(2, continuation);
            this.$this_useWriterConnection = roomDatabase;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C16622(this.$this_useWriterConnection, this.$block, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            RoomDatabase roomDatabase = this.$this_useWriterConnection;
            Function2<Transactor, Continuation, Object> function2 = this.$block;
            this.label = 1;
            Object objUseConnection = roomDatabase.useConnection(false, function2, this);
            return objUseConnection == objG ? objG : objUseConnection;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C16622) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <R> java.lang.Object useReaderConnection(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.Continuation, ? extends java.lang.Object> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof androidx.room.RoomDatabaseKt__RoomDatabaseKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1 r0 = (androidx.room.RoomDatabaseKt__RoomDatabaseKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1 r0 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            java.lang.Object r5 = r0.L$0
            androidx.room.RoomDatabase r5 = (androidx.room.RoomDatabase) r5
            kotlin.d.b(r7)
            goto L52
        L41:
            kotlin.d.b(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            r7 = 0
            java.lang.Object r7 = androidx.room.util.DBUtil.getCoroutineContext(r5, r7, r0)
            if (r7 != r1) goto L52
            goto L6c
        L52:
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            androidx.room.RoomExternalOperationElement r2 = androidx.room.RoomExternalOperationElement.INSTANCE
            kotlin.coroutines.CoroutineContext r7 = r7.plus(r2)
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2 r2 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r5 = eg.g.g(r7, r2, r0)
            if (r5 != r1) goto L6d
        L6c:
            return r1
        L6d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt__RoomDatabaseKt.useReaderConnection(androidx.room.RoomDatabase, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <R> java.lang.Object useWriterConnection(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.Continuation, ? extends java.lang.Object> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof androidx.room.RoomDatabaseKt__RoomDatabaseKt.C16611
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 r0 = (androidx.room.RoomDatabaseKt__RoomDatabaseKt.C16611) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 r0 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$0
            androidx.room.RoomDatabase r5 = (androidx.room.RoomDatabase) r5
            kotlin.d.b(r7)
            goto L71
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            java.lang.Object r5 = r0.L$0
            androidx.room.RoomDatabase r5 = (androidx.room.RoomDatabase) r5
            kotlin.d.b(r7)
            goto L56
        L45:
            kotlin.d.b(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            r7 = 0
            java.lang.Object r7 = androidx.room.util.DBUtil.getCoroutineContext(r5, r7, r0)
            if (r7 != r1) goto L56
            goto L70
        L56:
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            androidx.room.RoomExternalOperationElement r2 = androidx.room.RoomExternalOperationElement.INSTANCE
            kotlin.coroutines.CoroutineContext r7 = r7.plus(r2)
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2 r2 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.L$0 = r5
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r7 = eg.g.g(r7, r2, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            androidx.room.InvalidationTracker r5 = r5.getInvalidationTracker()
            r5.refreshAsync()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt__RoomDatabaseKt.useWriterConnection(androidx.room.RoomDatabase, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void validateAutoMigrations(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r9, @org.jetbrains.annotations.NotNull androidx.room.DatabaseConfiguration r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r1 = r9.getRequiredAutoMigrationSpecClasses()
            java.util.List<androidx.room.migration.AutoMigrationSpec> r2 = r10.autoMigrationSpecs
            int r2 = r2.size()
            boolean[] r3 = new boolean[r2]
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r4 = r1.hasNext()
            r5 = -1
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r1.next()
            kotlin.reflect.KClass r4 = (kotlin.reflect.KClass) r4
            java.util.List<androidx.room.migration.AutoMigrationSpec> r6 = r10.autoMigrationSpecs
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            int r6 = r6 + r5
            if (r6 < 0) goto L4f
        L37:
            int r7 = r6 + (-1)
            java.util.List<androidx.room.migration.AutoMigrationSpec> r8 = r10.autoMigrationSpecs
            java.lang.Object r8 = r8.get(r6)
            boolean r8 = r4.isInstance(r8)
            if (r8 == 0) goto L4a
            r5 = 1
            r3[r6] = r5
            r5 = r6
            goto L4f
        L4a:
            if (r7 >= 0) goto L4d
            goto L4f
        L4d:
            r6 = r7
            goto L37
        L4f:
            if (r5 < 0) goto L5b
            java.util.List<androidx.room.migration.AutoMigrationSpec> r6 = r10.autoMigrationSpecs
            java.lang.Object r5 = r6.get(r5)
            r0.put(r4, r5)
            goto L1f
        L5b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "A required auto migration spec ("
            r9.append(r10)
            java.lang.String r10 = r4.getQualifiedName()
            r9.append(r10)
            java.lang.String r10 = ") is missing in the database configuration."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L7f:
            java.util.List<androidx.room.migration.AutoMigrationSpec> r1 = r10.autoMigrationSpecs
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            int r1 = r1 + r5
            if (r1 < 0) goto L9f
        L8a:
            int r4 = r1 + (-1)
            if (r1 >= r2) goto L97
            boolean r1 = r3[r1]
            if (r1 == 0) goto L97
            if (r4 >= 0) goto L95
            goto L9f
        L95:
            r1 = r4
            goto L8a
        L97:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            r9.<init>(r10)
            throw r9
        L9f:
            java.util.List r9 = r9.createAutoMigrations(r0)
            java.util.Iterator r9 = r9.iterator()
        La7:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lc5
            java.lang.Object r0 = r9.next()
            androidx.room.migration.Migration r0 = (androidx.room.migration.Migration) r0
            androidx.room.RoomDatabase$MigrationContainer r1 = r10.migrationContainer
            int r2 = r0.startVersion
            int r3 = r0.endVersion
            boolean r1 = r1.contains(r2, r3)
            if (r1 != 0) goto La7
            androidx.room.RoomDatabase$MigrationContainer r1 = r10.migrationContainer
            r1.addMigration(r0)
            goto La7
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt__RoomDatabaseKt.validateAutoMigrations(androidx.room.RoomDatabase, androidx.room.DatabaseConfiguration):void");
    }

    public static final void validateMigrationsNotRequired(@NotNull Set<Integer> migrationStartAndEndVersions, @NotNull Set<Integer> migrationsNotRequiredFrom) {
        Intrinsics.checkNotNullParameter(migrationStartAndEndVersions, "migrationStartAndEndVersions");
        Intrinsics.checkNotNullParameter(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
        if (migrationStartAndEndVersions.isEmpty()) {
            return;
        }
        Iterator<Integer> it = migrationStartAndEndVersions.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: " + iIntValue).toString());
            }
        }
    }

    public static final void validateTypeConverters(@NotNull RoomDatabase roomDatabase, @NotNull DatabaseConfiguration configuration) {
        Intrinsics.checkNotNullParameter(roomDatabase, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Map<KClass<?>, List<KClass<?>>> requiredTypeConverterClassesMap$room_runtime = roomDatabase.getRequiredTypeConverterClassesMap$room_runtime();
        boolean[] zArr = new boolean[configuration.typeConverters.size()];
        for (Map.Entry<KClass<?>, List<KClass<?>>> entry : requiredTypeConverterClassesMap$room_runtime.entrySet()) {
            KClass<?> key = entry.getKey();
            for (KClass<?> kClass : entry.getValue()) {
                int size = configuration.typeConverters.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i10 = size - 1;
                        if (kClass.isInstance(configuration.typeConverters.get(size))) {
                            zArr[size] = true;
                            break;
                        } else if (i10 < 0) {
                            break;
                        } else {
                            size = i10;
                        }
                    }
                    size = -1;
                } else {
                    size = -1;
                }
                if (size < 0) {
                    throw new IllegalArgumentException(("A required type converter (" + kClass.getQualifiedName() + ") for " + key.getQualifiedName() + " is missing in the database configuration.").toString());
                }
                roomDatabase.addTypeConverter$room_runtime(kClass, configuration.typeConverters.get(size));
            }
        }
        int size2 = configuration.typeConverters.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            if (!zArr[size2]) {
                throw new IllegalArgumentException("Unexpected type converter " + configuration.typeConverters.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
            }
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }
}
