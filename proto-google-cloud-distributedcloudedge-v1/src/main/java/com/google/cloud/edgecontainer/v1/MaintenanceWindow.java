/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/edgecontainer/v1/resources.proto

package com.google.cloud.edgecontainer.v1;

/**
 *
 *
 * <pre>
 * Maintenance window configuration
 * </pre>
 *
 * Protobuf type {@code google.cloud.edgecontainer.v1.MaintenanceWindow}
 */
public final class MaintenanceWindow extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.edgecontainer.v1.MaintenanceWindow)
    MaintenanceWindowOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MaintenanceWindow.newBuilder() to construct.
  private MaintenanceWindow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MaintenanceWindow() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MaintenanceWindow();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private MaintenanceWindow(
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
          case 10:
            {
              com.google.cloud.edgecontainer.v1.RecurringTimeWindow.Builder subBuilder = null;
              if (recurringWindow_ != null) {
                subBuilder = recurringWindow_.toBuilder();
              }
              recurringWindow_ =
                  input.readMessage(
                      com.google.cloud.edgecontainer.v1.RecurringTimeWindow.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(recurringWindow_);
                recurringWindow_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.edgecontainer.v1.ResourcesProto
        .internal_static_google_cloud_edgecontainer_v1_MaintenanceWindow_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.edgecontainer.v1.ResourcesProto
        .internal_static_google_cloud_edgecontainer_v1_MaintenanceWindow_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.edgecontainer.v1.MaintenanceWindow.class,
            com.google.cloud.edgecontainer.v1.MaintenanceWindow.Builder.class);
  }

  public static final int RECURRING_WINDOW_FIELD_NUMBER = 1;
  private com.google.cloud.edgecontainer.v1.RecurringTimeWindow recurringWindow_;
  /**
   *
   *
   * <pre>
   * Configuration of a recurring maintenance window.
   * </pre>
   *
   * <code>.google.cloud.edgecontainer.v1.RecurringTimeWindow recurring_window = 1;</code>
   *
   * @return Whether the recurringWindow field is set.
   */
  @java.lang.Override
  public boolean hasRecurringWindow() {
    return recurringWindow_ != null;
  }
  /**
   *
   *
   * <pre>
   * Configuration of a recurring maintenance window.
   * </pre>
   *
   * <code>.google.cloud.edgecontainer.v1.RecurringTimeWindow recurring_window = 1;</code>
   *
   * @return The recurringWindow.
   */
  @java.lang.Override
  public com.google.cloud.edgecontainer.v1.RecurringTimeWindow getRecurringWindow() {
    return recurringWindow_ == null
        ? com.google.cloud.edgecontainer.v1.RecurringTimeWindow.getDefaultInstance()
        : recurringWindow_;
  }
  /**
   *
   *
   * <pre>
   * Configuration of a recurring maintenance window.
   * </pre>
   *
   * <code>.google.cloud.edgecontainer.v1.RecurringTimeWindow recurring_window = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.edgecontainer.v1.RecurringTimeWindowOrBuilder
      getRecurringWindowOrBuilder() {
    return getRecurringWindow();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (recurringWindow_ != null) {
      output.writeMessage(1, getRecurringWindow());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (recurringWindow_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRecurringWindow());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.edgecontainer.v1.MaintenanceWindow)) {
      return super.equals(obj);
    }
    com.google.cloud.edgecontainer.v1.MaintenanceWindow other =
        (com.google.cloud.edgecontainer.v1.MaintenanceWindow) obj;

    if (hasRecurringWindow() != other.hasRecurringWindow()) return false;
    if (hasRecurringWindow()) {
      if (!getRecurringWindow().equals(other.getRecurringWindow())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRecurringWindow()) {
      hash = (37 * hash) + RECURRING_WINDOW_FIELD_NUMBER;
      hash = (53 * hash) + getRecurringWindow().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.edgecontainer.v1.MaintenanceWindow parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgecontainer.v1.MaintenanceWindow parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.MaintenanceWindow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgecontainer.v1.MaintenanceWindow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.MaintenanceWindow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgecontainer.v1.MaintenanceWindow parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.MaintenanceWindow parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgecontainer.v1.MaintenanceWindow parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.MaintenanceWindow parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgecontainer.v1.MaintenanceWindow parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.MaintenanceWindow parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgecontainer.v1.MaintenanceWindow parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.edgecontainer.v1.MaintenanceWindow prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Maintenance window configuration
   * </pre>
   *
   * Protobuf type {@code google.cloud.edgecontainer.v1.MaintenanceWindow}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.edgecontainer.v1.MaintenanceWindow)
      com.google.cloud.edgecontainer.v1.MaintenanceWindowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.edgecontainer.v1.ResourcesProto
          .internal_static_google_cloud_edgecontainer_v1_MaintenanceWindow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.edgecontainer.v1.ResourcesProto
          .internal_static_google_cloud_edgecontainer_v1_MaintenanceWindow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.edgecontainer.v1.MaintenanceWindow.class,
              com.google.cloud.edgecontainer.v1.MaintenanceWindow.Builder.class);
    }

    // Construct using com.google.cloud.edgecontainer.v1.MaintenanceWindow.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (recurringWindowBuilder_ == null) {
        recurringWindow_ = null;
      } else {
        recurringWindow_ = null;
        recurringWindowBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.edgecontainer.v1.ResourcesProto
          .internal_static_google_cloud_edgecontainer_v1_MaintenanceWindow_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.edgecontainer.v1.MaintenanceWindow getDefaultInstanceForType() {
      return com.google.cloud.edgecontainer.v1.MaintenanceWindow.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.edgecontainer.v1.MaintenanceWindow build() {
      com.google.cloud.edgecontainer.v1.MaintenanceWindow result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.edgecontainer.v1.MaintenanceWindow buildPartial() {
      com.google.cloud.edgecontainer.v1.MaintenanceWindow result =
          new com.google.cloud.edgecontainer.v1.MaintenanceWindow(this);
      if (recurringWindowBuilder_ == null) {
        result.recurringWindow_ = recurringWindow_;
      } else {
        result.recurringWindow_ = recurringWindowBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.edgecontainer.v1.MaintenanceWindow) {
        return mergeFrom((com.google.cloud.edgecontainer.v1.MaintenanceWindow) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.edgecontainer.v1.MaintenanceWindow other) {
      if (other == com.google.cloud.edgecontainer.v1.MaintenanceWindow.getDefaultInstance())
        return this;
      if (other.hasRecurringWindow()) {
        mergeRecurringWindow(other.getRecurringWindow());
      }
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
      com.google.cloud.edgecontainer.v1.MaintenanceWindow parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.edgecontainer.v1.MaintenanceWindow) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.edgecontainer.v1.RecurringTimeWindow recurringWindow_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.edgecontainer.v1.RecurringTimeWindow,
            com.google.cloud.edgecontainer.v1.RecurringTimeWindow.Builder,
            com.google.cloud.edgecontainer.v1.RecurringTimeWindowOrBuilder>
        recurringWindowBuilder_;
    /**
     *
     *
     * <pre>
     * Configuration of a recurring maintenance window.
     * </pre>
     *
     * <code>.google.cloud.edgecontainer.v1.RecurringTimeWindow recurring_window = 1;</code>
     *
     * @return Whether the recurringWindow field is set.
     */
    public boolean hasRecurringWindow() {
      return recurringWindowBuilder_ != null || recurringWindow_ != null;
    }
    /**
     *
     *
     * <pre>
     * Configuration of a recurring maintenance window.
     * </pre>
     *
     * <code>.google.cloud.edgecontainer.v1.RecurringTimeWindow recurring_window = 1;</code>
     *
     * @return The recurringWindow.
     */
    public com.google.cloud.edgecontainer.v1.RecurringTimeWindow getRecurringWindow() {
      if (recurringWindowBuilder_ == null) {
        return recurringWindow_ == null
            ? com.google.cloud.edgecontainer.v1.RecurringTimeWindow.getDefaultInstance()
            : recurringWindow_;
      } else {
        return recurringWindowBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Configuration of a recurring maintenance window.
     * </pre>
     *
     * <code>.google.cloud.edgecontainer.v1.RecurringTimeWindow recurring_window = 1;</code>
     */
    public Builder setRecurringWindow(com.google.cloud.edgecontainer.v1.RecurringTimeWindow value) {
      if (recurringWindowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        recurringWindow_ = value;
        onChanged();
      } else {
        recurringWindowBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration of a recurring maintenance window.
     * </pre>
     *
     * <code>.google.cloud.edgecontainer.v1.RecurringTimeWindow recurring_window = 1;</code>
     */
    public Builder setRecurringWindow(
        com.google.cloud.edgecontainer.v1.RecurringTimeWindow.Builder builderForValue) {
      if (recurringWindowBuilder_ == null) {
        recurringWindow_ = builderForValue.build();
        onChanged();
      } else {
        recurringWindowBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration of a recurring maintenance window.
     * </pre>
     *
     * <code>.google.cloud.edgecontainer.v1.RecurringTimeWindow recurring_window = 1;</code>
     */
    public Builder mergeRecurringWindow(
        com.google.cloud.edgecontainer.v1.RecurringTimeWindow value) {
      if (recurringWindowBuilder_ == null) {
        if (recurringWindow_ != null) {
          recurringWindow_ =
              com.google.cloud.edgecontainer.v1.RecurringTimeWindow.newBuilder(recurringWindow_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          recurringWindow_ = value;
        }
        onChanged();
      } else {
        recurringWindowBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration of a recurring maintenance window.
     * </pre>
     *
     * <code>.google.cloud.edgecontainer.v1.RecurringTimeWindow recurring_window = 1;</code>
     */
    public Builder clearRecurringWindow() {
      if (recurringWindowBuilder_ == null) {
        recurringWindow_ = null;
        onChanged();
      } else {
        recurringWindow_ = null;
        recurringWindowBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Configuration of a recurring maintenance window.
     * </pre>
     *
     * <code>.google.cloud.edgecontainer.v1.RecurringTimeWindow recurring_window = 1;</code>
     */
    public com.google.cloud.edgecontainer.v1.RecurringTimeWindow.Builder
        getRecurringWindowBuilder() {

      onChanged();
      return getRecurringWindowFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Configuration of a recurring maintenance window.
     * </pre>
     *
     * <code>.google.cloud.edgecontainer.v1.RecurringTimeWindow recurring_window = 1;</code>
     */
    public com.google.cloud.edgecontainer.v1.RecurringTimeWindowOrBuilder
        getRecurringWindowOrBuilder() {
      if (recurringWindowBuilder_ != null) {
        return recurringWindowBuilder_.getMessageOrBuilder();
      } else {
        return recurringWindow_ == null
            ? com.google.cloud.edgecontainer.v1.RecurringTimeWindow.getDefaultInstance()
            : recurringWindow_;
      }
    }
    /**
     *
     *
     * <pre>
     * Configuration of a recurring maintenance window.
     * </pre>
     *
     * <code>.google.cloud.edgecontainer.v1.RecurringTimeWindow recurring_window = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.edgecontainer.v1.RecurringTimeWindow,
            com.google.cloud.edgecontainer.v1.RecurringTimeWindow.Builder,
            com.google.cloud.edgecontainer.v1.RecurringTimeWindowOrBuilder>
        getRecurringWindowFieldBuilder() {
      if (recurringWindowBuilder_ == null) {
        recurringWindowBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.edgecontainer.v1.RecurringTimeWindow,
                com.google.cloud.edgecontainer.v1.RecurringTimeWindow.Builder,
                com.google.cloud.edgecontainer.v1.RecurringTimeWindowOrBuilder>(
                getRecurringWindow(), getParentForChildren(), isClean());
        recurringWindow_ = null;
      }
      return recurringWindowBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.edgecontainer.v1.MaintenanceWindow)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.edgecontainer.v1.MaintenanceWindow)
  private static final com.google.cloud.edgecontainer.v1.MaintenanceWindow DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.edgecontainer.v1.MaintenanceWindow();
  }

  public static com.google.cloud.edgecontainer.v1.MaintenanceWindow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MaintenanceWindow> PARSER =
      new com.google.protobuf.AbstractParser<MaintenanceWindow>() {
        @java.lang.Override
        public MaintenanceWindow parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new MaintenanceWindow(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<MaintenanceWindow> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MaintenanceWindow> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.edgecontainer.v1.MaintenanceWindow getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
