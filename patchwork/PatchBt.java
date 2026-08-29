/**
 * Backward-compatible entry point for older notes and local commands.
 *
 * @deprecated Use {@link PatchClientInfo}; it also repairs the duplicate
 *             client-info payload in {@code ac.class}.
 */
@Deprecated
public final class PatchBt {
    private PatchBt() {
    }

    public static void main(String[] args) throws Exception {
        PatchClientInfo.main(args);
    }
}
