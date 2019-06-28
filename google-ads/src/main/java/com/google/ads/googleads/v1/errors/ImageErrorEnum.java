// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/image_error.proto

package com.google.ads.googleads.v1.errors;

/**
 * <pre>
 * Container for enum describing possible image errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.errors.ImageErrorEnum}
 */
public  final class ImageErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.errors.ImageErrorEnum)
    ImageErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImageErrorEnum.newBuilder() to construct.
  private ImageErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImageErrorEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImageErrorEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v1.errors.ImageErrorProto.internal_static_google_ads_googleads_v1_errors_ImageErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.errors.ImageErrorProto.internal_static_google_ads_googleads_v1_errors_ImageErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.errors.ImageErrorEnum.class, com.google.ads.googleads.v1.errors.ImageErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible image errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.errors.ImageErrorEnum.ImageError}
   */
  public enum ImageError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The image is not valid.
     * </pre>
     *
     * <code>INVALID_IMAGE = 2;</code>
     */
    INVALID_IMAGE(2),
    /**
     * <pre>
     * The image could not be stored.
     * </pre>
     *
     * <code>STORAGE_ERROR = 3;</code>
     */
    STORAGE_ERROR(3),
    /**
     * <pre>
     * There was a problem with the request.
     * </pre>
     *
     * <code>BAD_REQUEST = 4;</code>
     */
    BAD_REQUEST(4),
    /**
     * <pre>
     * The image is not of legal dimensions.
     * </pre>
     *
     * <code>UNEXPECTED_SIZE = 5;</code>
     */
    UNEXPECTED_SIZE(5),
    /**
     * <pre>
     * Animated image are not permitted.
     * </pre>
     *
     * <code>ANIMATED_NOT_ALLOWED = 6;</code>
     */
    ANIMATED_NOT_ALLOWED(6),
    /**
     * <pre>
     * Animation is too long.
     * </pre>
     *
     * <code>ANIMATION_TOO_LONG = 7;</code>
     */
    ANIMATION_TOO_LONG(7),
    /**
     * <pre>
     * There was an error on the server.
     * </pre>
     *
     * <code>SERVER_ERROR = 8;</code>
     */
    SERVER_ERROR(8),
    /**
     * <pre>
     * Image cannot be in CMYK color format.
     * </pre>
     *
     * <code>CMYK_JPEG_NOT_ALLOWED = 9;</code>
     */
    CMYK_JPEG_NOT_ALLOWED(9),
    /**
     * <pre>
     * Flash images are not permitted.
     * </pre>
     *
     * <code>FLASH_NOT_ALLOWED = 10;</code>
     */
    FLASH_NOT_ALLOWED(10),
    /**
     * <pre>
     * Flash images must support clickTag.
     * </pre>
     *
     * <code>FLASH_WITHOUT_CLICKTAG = 11;</code>
     */
    FLASH_WITHOUT_CLICKTAG(11),
    /**
     * <pre>
     * A flash error has occurred after fixing the click tag.
     * </pre>
     *
     * <code>FLASH_ERROR_AFTER_FIXING_CLICK_TAG = 12;</code>
     */
    FLASH_ERROR_AFTER_FIXING_CLICK_TAG(12),
    /**
     * <pre>
     * Unacceptable visual effects.
     * </pre>
     *
     * <code>ANIMATED_VISUAL_EFFECT = 13;</code>
     */
    ANIMATED_VISUAL_EFFECT(13),
    /**
     * <pre>
     * There was a problem with the flash image.
     * </pre>
     *
     * <code>FLASH_ERROR = 14;</code>
     */
    FLASH_ERROR(14),
    /**
     * <pre>
     * Incorrect image layout.
     * </pre>
     *
     * <code>LAYOUT_PROBLEM = 15;</code>
     */
    LAYOUT_PROBLEM(15),
    /**
     * <pre>
     * There was a problem reading the image file.
     * </pre>
     *
     * <code>PROBLEM_READING_IMAGE_FILE = 16;</code>
     */
    PROBLEM_READING_IMAGE_FILE(16),
    /**
     * <pre>
     * There was an error storing the image.
     * </pre>
     *
     * <code>ERROR_STORING_IMAGE = 17;</code>
     */
    ERROR_STORING_IMAGE(17),
    /**
     * <pre>
     * The aspect ratio of the image is not allowed.
     * </pre>
     *
     * <code>ASPECT_RATIO_NOT_ALLOWED = 18;</code>
     */
    ASPECT_RATIO_NOT_ALLOWED(18),
    /**
     * <pre>
     * Flash cannot have network objects.
     * </pre>
     *
     * <code>FLASH_HAS_NETWORK_OBJECTS = 19;</code>
     */
    FLASH_HAS_NETWORK_OBJECTS(19),
    /**
     * <pre>
     * Flash cannot have network methods.
     * </pre>
     *
     * <code>FLASH_HAS_NETWORK_METHODS = 20;</code>
     */
    FLASH_HAS_NETWORK_METHODS(20),
    /**
     * <pre>
     * Flash cannot have a Url.
     * </pre>
     *
     * <code>FLASH_HAS_URL = 21;</code>
     */
    FLASH_HAS_URL(21),
    /**
     * <pre>
     * Flash cannot use mouse tracking.
     * </pre>
     *
     * <code>FLASH_HAS_MOUSE_TRACKING = 22;</code>
     */
    FLASH_HAS_MOUSE_TRACKING(22),
    /**
     * <pre>
     * Flash cannot have a random number.
     * </pre>
     *
     * <code>FLASH_HAS_RANDOM_NUM = 23;</code>
     */
    FLASH_HAS_RANDOM_NUM(23),
    /**
     * <pre>
     * Ad click target cannot be '_self'.
     * </pre>
     *
     * <code>FLASH_SELF_TARGETS = 24;</code>
     */
    FLASH_SELF_TARGETS(24),
    /**
     * <pre>
     * GetUrl method should only use '_blank'.
     * </pre>
     *
     * <code>FLASH_BAD_GETURL_TARGET = 25;</code>
     */
    FLASH_BAD_GETURL_TARGET(25),
    /**
     * <pre>
     * Flash version is not supported.
     * </pre>
     *
     * <code>FLASH_VERSION_NOT_SUPPORTED = 26;</code>
     */
    FLASH_VERSION_NOT_SUPPORTED(26),
    /**
     * <pre>
     * Flash movies need to have hard coded click URL or clickTAG
     * </pre>
     *
     * <code>FLASH_WITHOUT_HARD_CODED_CLICK_URL = 27;</code>
     */
    FLASH_WITHOUT_HARD_CODED_CLICK_URL(27),
    /**
     * <pre>
     * Uploaded flash file is corrupted.
     * </pre>
     *
     * <code>INVALID_FLASH_FILE = 28;</code>
     */
    INVALID_FLASH_FILE(28),
    /**
     * <pre>
     * Uploaded flash file can be parsed, but the click tag can not be fixed
     * properly.
     * </pre>
     *
     * <code>FAILED_TO_FIX_CLICK_TAG_IN_FLASH = 29;</code>
     */
    FAILED_TO_FIX_CLICK_TAG_IN_FLASH(29),
    /**
     * <pre>
     * Flash movie accesses network resources
     * </pre>
     *
     * <code>FLASH_ACCESSES_NETWORK_RESOURCES = 30;</code>
     */
    FLASH_ACCESSES_NETWORK_RESOURCES(30),
    /**
     * <pre>
     * Flash movie attempts to call external javascript code
     * </pre>
     *
     * <code>FLASH_EXTERNAL_JS_CALL = 31;</code>
     */
    FLASH_EXTERNAL_JS_CALL(31),
    /**
     * <pre>
     * Flash movie attempts to call flash system commands
     * </pre>
     *
     * <code>FLASH_EXTERNAL_FS_CALL = 32;</code>
     */
    FLASH_EXTERNAL_FS_CALL(32),
    /**
     * <pre>
     * Image file is too large.
     * </pre>
     *
     * <code>FILE_TOO_LARGE = 33;</code>
     */
    FILE_TOO_LARGE(33),
    /**
     * <pre>
     * Image data is too large.
     * </pre>
     *
     * <code>IMAGE_DATA_TOO_LARGE = 34;</code>
     */
    IMAGE_DATA_TOO_LARGE(34),
    /**
     * <pre>
     * Error while processing the image.
     * </pre>
     *
     * <code>IMAGE_PROCESSING_ERROR = 35;</code>
     */
    IMAGE_PROCESSING_ERROR(35),
    /**
     * <pre>
     * Image is too small.
     * </pre>
     *
     * <code>IMAGE_TOO_SMALL = 36;</code>
     */
    IMAGE_TOO_SMALL(36),
    /**
     * <pre>
     * Input was invalid.
     * </pre>
     *
     * <code>INVALID_INPUT = 37;</code>
     */
    INVALID_INPUT(37),
    /**
     * <pre>
     * There was a problem reading the image file.
     * </pre>
     *
     * <code>PROBLEM_READING_FILE = 38;</code>
     */
    PROBLEM_READING_FILE(38),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The image is not valid.
     * </pre>
     *
     * <code>INVALID_IMAGE = 2;</code>
     */
    public static final int INVALID_IMAGE_VALUE = 2;
    /**
     * <pre>
     * The image could not be stored.
     * </pre>
     *
     * <code>STORAGE_ERROR = 3;</code>
     */
    public static final int STORAGE_ERROR_VALUE = 3;
    /**
     * <pre>
     * There was a problem with the request.
     * </pre>
     *
     * <code>BAD_REQUEST = 4;</code>
     */
    public static final int BAD_REQUEST_VALUE = 4;
    /**
     * <pre>
     * The image is not of legal dimensions.
     * </pre>
     *
     * <code>UNEXPECTED_SIZE = 5;</code>
     */
    public static final int UNEXPECTED_SIZE_VALUE = 5;
    /**
     * <pre>
     * Animated image are not permitted.
     * </pre>
     *
     * <code>ANIMATED_NOT_ALLOWED = 6;</code>
     */
    public static final int ANIMATED_NOT_ALLOWED_VALUE = 6;
    /**
     * <pre>
     * Animation is too long.
     * </pre>
     *
     * <code>ANIMATION_TOO_LONG = 7;</code>
     */
    public static final int ANIMATION_TOO_LONG_VALUE = 7;
    /**
     * <pre>
     * There was an error on the server.
     * </pre>
     *
     * <code>SERVER_ERROR = 8;</code>
     */
    public static final int SERVER_ERROR_VALUE = 8;
    /**
     * <pre>
     * Image cannot be in CMYK color format.
     * </pre>
     *
     * <code>CMYK_JPEG_NOT_ALLOWED = 9;</code>
     */
    public static final int CMYK_JPEG_NOT_ALLOWED_VALUE = 9;
    /**
     * <pre>
     * Flash images are not permitted.
     * </pre>
     *
     * <code>FLASH_NOT_ALLOWED = 10;</code>
     */
    public static final int FLASH_NOT_ALLOWED_VALUE = 10;
    /**
     * <pre>
     * Flash images must support clickTag.
     * </pre>
     *
     * <code>FLASH_WITHOUT_CLICKTAG = 11;</code>
     */
    public static final int FLASH_WITHOUT_CLICKTAG_VALUE = 11;
    /**
     * <pre>
     * A flash error has occurred after fixing the click tag.
     * </pre>
     *
     * <code>FLASH_ERROR_AFTER_FIXING_CLICK_TAG = 12;</code>
     */
    public static final int FLASH_ERROR_AFTER_FIXING_CLICK_TAG_VALUE = 12;
    /**
     * <pre>
     * Unacceptable visual effects.
     * </pre>
     *
     * <code>ANIMATED_VISUAL_EFFECT = 13;</code>
     */
    public static final int ANIMATED_VISUAL_EFFECT_VALUE = 13;
    /**
     * <pre>
     * There was a problem with the flash image.
     * </pre>
     *
     * <code>FLASH_ERROR = 14;</code>
     */
    public static final int FLASH_ERROR_VALUE = 14;
    /**
     * <pre>
     * Incorrect image layout.
     * </pre>
     *
     * <code>LAYOUT_PROBLEM = 15;</code>
     */
    public static final int LAYOUT_PROBLEM_VALUE = 15;
    /**
     * <pre>
     * There was a problem reading the image file.
     * </pre>
     *
     * <code>PROBLEM_READING_IMAGE_FILE = 16;</code>
     */
    public static final int PROBLEM_READING_IMAGE_FILE_VALUE = 16;
    /**
     * <pre>
     * There was an error storing the image.
     * </pre>
     *
     * <code>ERROR_STORING_IMAGE = 17;</code>
     */
    public static final int ERROR_STORING_IMAGE_VALUE = 17;
    /**
     * <pre>
     * The aspect ratio of the image is not allowed.
     * </pre>
     *
     * <code>ASPECT_RATIO_NOT_ALLOWED = 18;</code>
     */
    public static final int ASPECT_RATIO_NOT_ALLOWED_VALUE = 18;
    /**
     * <pre>
     * Flash cannot have network objects.
     * </pre>
     *
     * <code>FLASH_HAS_NETWORK_OBJECTS = 19;</code>
     */
    public static final int FLASH_HAS_NETWORK_OBJECTS_VALUE = 19;
    /**
     * <pre>
     * Flash cannot have network methods.
     * </pre>
     *
     * <code>FLASH_HAS_NETWORK_METHODS = 20;</code>
     */
    public static final int FLASH_HAS_NETWORK_METHODS_VALUE = 20;
    /**
     * <pre>
     * Flash cannot have a Url.
     * </pre>
     *
     * <code>FLASH_HAS_URL = 21;</code>
     */
    public static final int FLASH_HAS_URL_VALUE = 21;
    /**
     * <pre>
     * Flash cannot use mouse tracking.
     * </pre>
     *
     * <code>FLASH_HAS_MOUSE_TRACKING = 22;</code>
     */
    public static final int FLASH_HAS_MOUSE_TRACKING_VALUE = 22;
    /**
     * <pre>
     * Flash cannot have a random number.
     * </pre>
     *
     * <code>FLASH_HAS_RANDOM_NUM = 23;</code>
     */
    public static final int FLASH_HAS_RANDOM_NUM_VALUE = 23;
    /**
     * <pre>
     * Ad click target cannot be '_self'.
     * </pre>
     *
     * <code>FLASH_SELF_TARGETS = 24;</code>
     */
    public static final int FLASH_SELF_TARGETS_VALUE = 24;
    /**
     * <pre>
     * GetUrl method should only use '_blank'.
     * </pre>
     *
     * <code>FLASH_BAD_GETURL_TARGET = 25;</code>
     */
    public static final int FLASH_BAD_GETURL_TARGET_VALUE = 25;
    /**
     * <pre>
     * Flash version is not supported.
     * </pre>
     *
     * <code>FLASH_VERSION_NOT_SUPPORTED = 26;</code>
     */
    public static final int FLASH_VERSION_NOT_SUPPORTED_VALUE = 26;
    /**
     * <pre>
     * Flash movies need to have hard coded click URL or clickTAG
     * </pre>
     *
     * <code>FLASH_WITHOUT_HARD_CODED_CLICK_URL = 27;</code>
     */
    public static final int FLASH_WITHOUT_HARD_CODED_CLICK_URL_VALUE = 27;
    /**
     * <pre>
     * Uploaded flash file is corrupted.
     * </pre>
     *
     * <code>INVALID_FLASH_FILE = 28;</code>
     */
    public static final int INVALID_FLASH_FILE_VALUE = 28;
    /**
     * <pre>
     * Uploaded flash file can be parsed, but the click tag can not be fixed
     * properly.
     * </pre>
     *
     * <code>FAILED_TO_FIX_CLICK_TAG_IN_FLASH = 29;</code>
     */
    public static final int FAILED_TO_FIX_CLICK_TAG_IN_FLASH_VALUE = 29;
    /**
     * <pre>
     * Flash movie accesses network resources
     * </pre>
     *
     * <code>FLASH_ACCESSES_NETWORK_RESOURCES = 30;</code>
     */
    public static final int FLASH_ACCESSES_NETWORK_RESOURCES_VALUE = 30;
    /**
     * <pre>
     * Flash movie attempts to call external javascript code
     * </pre>
     *
     * <code>FLASH_EXTERNAL_JS_CALL = 31;</code>
     */
    public static final int FLASH_EXTERNAL_JS_CALL_VALUE = 31;
    /**
     * <pre>
     * Flash movie attempts to call flash system commands
     * </pre>
     *
     * <code>FLASH_EXTERNAL_FS_CALL = 32;</code>
     */
    public static final int FLASH_EXTERNAL_FS_CALL_VALUE = 32;
    /**
     * <pre>
     * Image file is too large.
     * </pre>
     *
     * <code>FILE_TOO_LARGE = 33;</code>
     */
    public static final int FILE_TOO_LARGE_VALUE = 33;
    /**
     * <pre>
     * Image data is too large.
     * </pre>
     *
     * <code>IMAGE_DATA_TOO_LARGE = 34;</code>
     */
    public static final int IMAGE_DATA_TOO_LARGE_VALUE = 34;
    /**
     * <pre>
     * Error while processing the image.
     * </pre>
     *
     * <code>IMAGE_PROCESSING_ERROR = 35;</code>
     */
    public static final int IMAGE_PROCESSING_ERROR_VALUE = 35;
    /**
     * <pre>
     * Image is too small.
     * </pre>
     *
     * <code>IMAGE_TOO_SMALL = 36;</code>
     */
    public static final int IMAGE_TOO_SMALL_VALUE = 36;
    /**
     * <pre>
     * Input was invalid.
     * </pre>
     *
     * <code>INVALID_INPUT = 37;</code>
     */
    public static final int INVALID_INPUT_VALUE = 37;
    /**
     * <pre>
     * There was a problem reading the image file.
     * </pre>
     *
     * <code>PROBLEM_READING_FILE = 38;</code>
     */
    public static final int PROBLEM_READING_FILE_VALUE = 38;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ImageError valueOf(int value) {
      return forNumber(value);
    }

    public static ImageError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return INVALID_IMAGE;
        case 3: return STORAGE_ERROR;
        case 4: return BAD_REQUEST;
        case 5: return UNEXPECTED_SIZE;
        case 6: return ANIMATED_NOT_ALLOWED;
        case 7: return ANIMATION_TOO_LONG;
        case 8: return SERVER_ERROR;
        case 9: return CMYK_JPEG_NOT_ALLOWED;
        case 10: return FLASH_NOT_ALLOWED;
        case 11: return FLASH_WITHOUT_CLICKTAG;
        case 12: return FLASH_ERROR_AFTER_FIXING_CLICK_TAG;
        case 13: return ANIMATED_VISUAL_EFFECT;
        case 14: return FLASH_ERROR;
        case 15: return LAYOUT_PROBLEM;
        case 16: return PROBLEM_READING_IMAGE_FILE;
        case 17: return ERROR_STORING_IMAGE;
        case 18: return ASPECT_RATIO_NOT_ALLOWED;
        case 19: return FLASH_HAS_NETWORK_OBJECTS;
        case 20: return FLASH_HAS_NETWORK_METHODS;
        case 21: return FLASH_HAS_URL;
        case 22: return FLASH_HAS_MOUSE_TRACKING;
        case 23: return FLASH_HAS_RANDOM_NUM;
        case 24: return FLASH_SELF_TARGETS;
        case 25: return FLASH_BAD_GETURL_TARGET;
        case 26: return FLASH_VERSION_NOT_SUPPORTED;
        case 27: return FLASH_WITHOUT_HARD_CODED_CLICK_URL;
        case 28: return INVALID_FLASH_FILE;
        case 29: return FAILED_TO_FIX_CLICK_TAG_IN_FLASH;
        case 30: return FLASH_ACCESSES_NETWORK_RESOURCES;
        case 31: return FLASH_EXTERNAL_JS_CALL;
        case 32: return FLASH_EXTERNAL_FS_CALL;
        case 33: return FILE_TOO_LARGE;
        case 34: return IMAGE_DATA_TOO_LARGE;
        case 35: return IMAGE_PROCESSING_ERROR;
        case 36: return IMAGE_TOO_SMALL;
        case 37: return INVALID_INPUT;
        case 38: return PROBLEM_READING_FILE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ImageError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ImageError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ImageError>() {
            public ImageError findValueByNumber(int number) {
              return ImageError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.errors.ImageErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ImageError[] VALUES = values();

    public static ImageError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ImageError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.errors.ImageErrorEnum.ImageError)
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v1.errors.ImageErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.errors.ImageErrorEnum other = (com.google.ads.googleads.v1.errors.ImageErrorEnum) obj;

    boolean result = true;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.errors.ImageErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.ImageErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.ImageErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.ImageErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.ImageErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.ImageErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.ImageErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.ImageErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.ImageErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.ImageErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.ImageErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.ImageErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v1.errors.ImageErrorEnum prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Container for enum describing possible image errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.errors.ImageErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.errors.ImageErrorEnum)
      com.google.ads.googleads.v1.errors.ImageErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.errors.ImageErrorProto.internal_static_google_ads_googleads_v1_errors_ImageErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.errors.ImageErrorProto.internal_static_google_ads_googleads_v1_errors_ImageErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.errors.ImageErrorEnum.class, com.google.ads.googleads.v1.errors.ImageErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.errors.ImageErrorEnum.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.errors.ImageErrorProto.internal_static_google_ads_googleads_v1_errors_ImageErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.ImageErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.errors.ImageErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.ImageErrorEnum build() {
      com.google.ads.googleads.v1.errors.ImageErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.ImageErrorEnum buildPartial() {
      com.google.ads.googleads.v1.errors.ImageErrorEnum result = new com.google.ads.googleads.v1.errors.ImageErrorEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v1.errors.ImageErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v1.errors.ImageErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.errors.ImageErrorEnum other) {
      if (other == com.google.ads.googleads.v1.errors.ImageErrorEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v1.errors.ImageErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.errors.ImageErrorEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.errors.ImageErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.errors.ImageErrorEnum)
  private static final com.google.ads.googleads.v1.errors.ImageErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.errors.ImageErrorEnum();
  }

  public static com.google.ads.googleads.v1.errors.ImageErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<ImageErrorEnum>() {
    @java.lang.Override
    public ImageErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImageErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImageErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.errors.ImageErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

