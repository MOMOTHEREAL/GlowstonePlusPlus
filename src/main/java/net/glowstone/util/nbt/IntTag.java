package net.glowstone.util.nbt;

/**
 * The {@code TAG_Int} tag.
 */
public final class IntTag extends Tag<Integer> {

    /**
     * The value.
     */
    private final int value;

    /**
     * Creates the tag.
     *
     * @param value The value.
     */
    public IntTag(int value) {
        super(TagType.INT);
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String toMojangson() {
        StringBuilder builder = new StringBuilder();
        builder.append(value);
        return builder.toString();
    }
}

