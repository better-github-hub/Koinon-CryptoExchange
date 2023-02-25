// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Login.proto

package com.bizzan.aqmd.core.entity;

public final class LoginMessage {
  private LoginMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LoginUserOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tutorial.LoginUser)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *用户名
     * </pre>
     *
     * <code>string username = 1;</code>
     */
    String getUsername();
    /**
     * <pre>
     *用户名
     * </pre>
     *
     * <code>string username = 1;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <pre>
     *密码
     * </pre>
     *
     * <code>string passwd = 2;</code>
     */
    String getPasswd();
    /**
     * <pre>
     *密码
     * </pre>
     *
     * <code>string passwd = 2;</code>
     */
    com.google.protobuf.ByteString
        getPasswdBytes();

    /**
     * <pre>
     *验证码
     * </pre>
     *
     * <code>string verificode = 3;</code>
     */
    String getVerificode();
    /**
     * <pre>
     *验证码
     * </pre>
     *
     * <code>string verificode = 3;</code>
     */
    com.google.protobuf.ByteString
        getVerificodeBytes();
  }
  /**
   * <pre>
   * [END java_declaration]
   *消息传输包
   * </pre>
   *
   * Protobuf type {@code tutorial.LoginUser}
   */
  public  static final class LoginUser extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tutorial.LoginUser)
      LoginUserOrBuilder {
    // Use LoginUser.newBuilder() to construct.
    private LoginUser(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LoginUser() {
      username_ = "";
      passwd_ = "";
      verificode_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private LoginUser(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              String s = input.readStringRequireUtf8();

              username_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              passwd_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              verificode_ = s;
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LoginMessage.internal_static_tutorial_LoginUser_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LoginMessage.internal_static_tutorial_LoginUser_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LoginUser.class, Builder.class);
    }

    public static final int USERNAME_FIELD_NUMBER = 1;
    private volatile Object username_;
    /**
     * <pre>
     *用户名
     * </pre>
     *
     * <code>string username = 1;</code>
     */
    public String getUsername() {
      Object ref = username_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        username_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *用户名
     * </pre>
     *
     * <code>string username = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PASSWD_FIELD_NUMBER = 2;
    private volatile Object passwd_;
    /**
     * <pre>
     *密码
     * </pre>
     *
     * <code>string passwd = 2;</code>
     */
    public String getPasswd() {
      Object ref = passwd_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        passwd_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *密码
     * </pre>
     *
     * <code>string passwd = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPasswdBytes() {
      Object ref = passwd_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        passwd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VERIFICODE_FIELD_NUMBER = 3;
    private volatile Object verificode_;
    /**
     * <pre>
     *验证码
     * </pre>
     *
     * <code>string verificode = 3;</code>
     */
    public String getVerificode() {
      Object ref = verificode_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        verificode_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *验证码
     * </pre>
     *
     * <code>string verificode = 3;</code>
     */
    public com.google.protobuf.ByteString
        getVerificodeBytes() {
      Object ref = verificode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        verificode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getUsernameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, username_);
      }
      if (!getPasswdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, passwd_);
      }
      if (!getVerificodeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, verificode_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getUsernameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, username_);
      }
      if (!getPasswdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, passwd_);
      }
      if (!getVerificodeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, verificode_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof LoginUser)) {
        return super.equals(obj);
      }
      LoginUser other = (LoginUser) obj;

      boolean result = true;
      result = result && getUsername()
          .equals(other.getUsername());
      result = result && getPasswd()
          .equals(other.getPasswd());
      result = result && getVerificode()
          .equals(other.getVerificode());
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsername().hashCode();
      hash = (37 * hash) + PASSWD_FIELD_NUMBER;
      hash = (53 * hash) + getPasswd().hashCode();
      hash = (37 * hash) + VERIFICODE_FIELD_NUMBER;
      hash = (53 * hash) + getVerificode().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static LoginUser parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LoginUser parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LoginUser parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LoginUser parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LoginUser parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LoginUser parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LoginUser parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LoginUser parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static LoginUser parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static LoginUser parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static LoginUser parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LoginUser parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(LoginUser prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * [END java_declaration]
     *消息传输包
     * </pre>
     *
     * Protobuf type {@code tutorial.LoginUser}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tutorial.LoginUser)
        LoginUserOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LoginMessage.internal_static_tutorial_LoginUser_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LoginMessage.internal_static_tutorial_LoginUser_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                LoginUser.class, Builder.class);
      }

      // Construct using com.spark.hawk.entity.LoginMessage.LoginUser.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        username_ = "";

        passwd_ = "";

        verificode_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return LoginMessage.internal_static_tutorial_LoginUser_descriptor;
      }

      public LoginUser getDefaultInstanceForType() {
        return LoginUser.getDefaultInstance();
      }

      public LoginUser build() {
        LoginUser result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public LoginUser buildPartial() {
        LoginUser result = new LoginUser(this);
        result.username_ = username_;
        result.passwd_ = passwd_;
        result.verificode_ = verificode_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof LoginUser) {
          return mergeFrom((LoginUser)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(LoginUser other) {
        if (other == LoginUser.getDefaultInstance()) return this;
        if (!other.getUsername().isEmpty()) {
          username_ = other.username_;
          onChanged();
        }
        if (!other.getPasswd().isEmpty()) {
          passwd_ = other.passwd_;
          onChanged();
        }
        if (!other.getVerificode().isEmpty()) {
          verificode_ = other.verificode_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        LoginUser parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (LoginUser) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object username_ = "";
      /**
       * <pre>
       *用户名
       * </pre>
       *
       * <code>string username = 1;</code>
       */
      public String getUsername() {
        Object ref = username_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       *用户名
       * </pre>
       *
       * <code>string username = 1;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *用户名
       * </pre>
       *
       * <code>string username = 1;</code>
       */
      public Builder setUsername(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *用户名
       * </pre>
       *
       * <code>string username = 1;</code>
       */
      public Builder clearUsername() {
        
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *用户名
       * </pre>
       *
       * <code>string username = 1;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        username_ = value;
        onChanged();
        return this;
      }

      private Object passwd_ = "";
      /**
       * <pre>
       *密码
       * </pre>
       *
       * <code>string passwd = 2;</code>
       */
      public String getPasswd() {
        Object ref = passwd_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          passwd_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       *密码
       * </pre>
       *
       * <code>string passwd = 2;</code>
       */
      public com.google.protobuf.ByteString
          getPasswdBytes() {
        Object ref = passwd_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          passwd_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *密码
       * </pre>
       *
       * <code>string passwd = 2;</code>
       */
      public Builder setPasswd(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        passwd_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *密码
       * </pre>
       *
       * <code>string passwd = 2;</code>
       */
      public Builder clearPasswd() {
        
        passwd_ = getDefaultInstance().getPasswd();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *密码
       * </pre>
       *
       * <code>string passwd = 2;</code>
       */
      public Builder setPasswdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        passwd_ = value;
        onChanged();
        return this;
      }

      private Object verificode_ = "";
      /**
       * <pre>
       *验证码
       * </pre>
       *
       * <code>string verificode = 3;</code>
       */
      public String getVerificode() {
        Object ref = verificode_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          verificode_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       *验证码
       * </pre>
       *
       * <code>string verificode = 3;</code>
       */
      public com.google.protobuf.ByteString
          getVerificodeBytes() {
        Object ref = verificode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          verificode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *验证码
       * </pre>
       *
       * <code>string verificode = 3;</code>
       */
      public Builder setVerificode(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        verificode_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *验证码
       * </pre>
       *
       * <code>string verificode = 3;</code>
       */
      public Builder clearVerificode() {
        
        verificode_ = getDefaultInstance().getVerificode();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *验证码
       * </pre>
       *
       * <code>string verificode = 3;</code>
       */
      public Builder setVerificodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        verificode_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:tutorial.LoginUser)
    }

    // @@protoc_insertion_point(class_scope:tutorial.LoginUser)
    private static final LoginUser DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new LoginUser();
    }

    public static LoginUser getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LoginUser>
        PARSER = new com.google.protobuf.AbstractParser<LoginUser>() {
      public LoginUser parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new LoginUser(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LoginUser> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<LoginUser> getParserForType() {
      return PARSER;
    }

    public LoginUser getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_LoginUser_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_LoginUser_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\013Login.proto\022\010tutorial\"A\n\tLoginUser\022\020\n\010" +
      "username\030\001 \001(\t\022\016\n\006passwd\030\002 \001(\t\022\022\n\nverifi" +
      "code\030\003 \001(\tB%\n\025com.spark.hawk.entityB\014Log" +
      "inMessageb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_tutorial_LoginUser_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tutorial_LoginUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_LoginUser_descriptor,
        new String[] { "Username", "Passwd", "Verificode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}