/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'RobotMessaging'
 * message type.
 */

public class RobotMessaging extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 13;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 147;

    /** Create a new RobotMessaging of size 13. */
    public RobotMessaging() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new RobotMessaging of the given data_length. */
    public RobotMessaging(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RobotMessaging with the given data_length
     * and base offset.
     */
    public RobotMessaging(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RobotMessaging using the given byte array
     * as backing store.
     */
    public RobotMessaging(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RobotMessaging using the given byte array
     * as backing store, with the given base offset.
     */
    public RobotMessaging(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RobotMessaging using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public RobotMessaging(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RobotMessaging embedded in the given message
     * at the given base offset.
     */
    public RobotMessaging(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new RobotMessaging embedded in the given message
     * at the given base offset and length.
     */
    public RobotMessaging(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <RobotMessaging> \n";
      try {
        s += "  [mode=0x"+Long.toHexString(get_mode())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [cmd=0x"+Long.toHexString(get_cmd())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [cmd_duration=0x"+Long.toHexString(get_cmd_duration())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [ack=0x"+Long.toHexString(get_ack())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [req_info=0x"+Long.toHexString(get_req_info())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [current_x=0x"+Long.toHexString(get_current_x())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [current_y=0x"+Long.toHexString(get_current_y())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [hit_wall=0x"+Long.toHexString(get_hit_wall())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [globalTime=0x"+Long.toHexString(get_globalTime())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: mode
    //   Field type: short, unsigned
    //   Offset (bits): 0
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'mode' is signed (false).
     */
    public static boolean isSigned_mode() {
        return false;
    }

    /**
     * Return whether the field 'mode' is an array (false).
     */
    public static boolean isArray_mode() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'mode'
     */
    public static int offset_mode() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'mode'
     */
    public static int offsetBits_mode() {
        return 0;
    }

    /**
     * Return the value (as a short) of the field 'mode'
     */
    public short get_mode() {
        return (short)getUIntBEElement(offsetBits_mode(), 8);
    }

    /**
     * Set the value of the field 'mode'
     */
    public void set_mode(short value) {
        setUIntBEElement(offsetBits_mode(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'mode'
     */
    public static int size_mode() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'mode'
     */
    public static int sizeBits_mode() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: cmd
    //   Field type: short, unsigned
    //   Offset (bits): 8
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'cmd' is signed (false).
     */
    public static boolean isSigned_cmd() {
        return false;
    }

    /**
     * Return whether the field 'cmd' is an array (false).
     */
    public static boolean isArray_cmd() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'cmd'
     */
    public static int offset_cmd() {
        return (8 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'cmd'
     */
    public static int offsetBits_cmd() {
        return 8;
    }

    /**
     * Return the value (as a short) of the field 'cmd'
     */
    public short get_cmd() {
        return (short)getUIntBEElement(offsetBits_cmd(), 8);
    }

    /**
     * Set the value of the field 'cmd'
     */
    public void set_cmd(short value) {
        setUIntBEElement(offsetBits_cmd(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'cmd'
     */
    public static int size_cmd() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'cmd'
     */
    public static int sizeBits_cmd() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: cmd_duration
    //   Field type: int, unsigned
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'cmd_duration' is signed (false).
     */
    public static boolean isSigned_cmd_duration() {
        return false;
    }

    /**
     * Return whether the field 'cmd_duration' is an array (false).
     */
    public static boolean isArray_cmd_duration() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'cmd_duration'
     */
    public static int offset_cmd_duration() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'cmd_duration'
     */
    public static int offsetBits_cmd_duration() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'cmd_duration'
     */
    public int get_cmd_duration() {
        return (int)getUIntBEElement(offsetBits_cmd_duration(), 16);
    }

    /**
     * Set the value of the field 'cmd_duration'
     */
    public void set_cmd_duration(int value) {
        setUIntBEElement(offsetBits_cmd_duration(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'cmd_duration'
     */
    public static int size_cmd_duration() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'cmd_duration'
     */
    public static int sizeBits_cmd_duration() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: ack
    //   Field type: short, unsigned
    //   Offset (bits): 32
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'ack' is signed (false).
     */
    public static boolean isSigned_ack() {
        return false;
    }

    /**
     * Return whether the field 'ack' is an array (false).
     */
    public static boolean isArray_ack() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'ack'
     */
    public static int offset_ack() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'ack'
     */
    public static int offsetBits_ack() {
        return 32;
    }

    /**
     * Return the value (as a short) of the field 'ack'
     */
    public short get_ack() {
        return (short)getUIntBEElement(offsetBits_ack(), 8);
    }

    /**
     * Set the value of the field 'ack'
     */
    public void set_ack(short value) {
        setUIntBEElement(offsetBits_ack(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'ack'
     */
    public static int size_ack() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'ack'
     */
    public static int sizeBits_ack() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: req_info
    //   Field type: short, unsigned
    //   Offset (bits): 40
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'req_info' is signed (false).
     */
    public static boolean isSigned_req_info() {
        return false;
    }

    /**
     * Return whether the field 'req_info' is an array (false).
     */
    public static boolean isArray_req_info() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'req_info'
     */
    public static int offset_req_info() {
        return (40 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'req_info'
     */
    public static int offsetBits_req_info() {
        return 40;
    }

    /**
     * Return the value (as a short) of the field 'req_info'
     */
    public short get_req_info() {
        return (short)getUIntBEElement(offsetBits_req_info(), 8);
    }

    /**
     * Set the value of the field 'req_info'
     */
    public void set_req_info(short value) {
        setUIntBEElement(offsetBits_req_info(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'req_info'
     */
    public static int size_req_info() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'req_info'
     */
    public static int sizeBits_req_info() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: current_x
    //   Field type: short, unsigned
    //   Offset (bits): 48
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'current_x' is signed (false).
     */
    public static boolean isSigned_current_x() {
        return false;
    }

    /**
     * Return whether the field 'current_x' is an array (false).
     */
    public static boolean isArray_current_x() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'current_x'
     */
    public static int offset_current_x() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'current_x'
     */
    public static int offsetBits_current_x() {
        return 48;
    }

    /**
     * Return the value (as a short) of the field 'current_x'
     */
    public short get_current_x() {
        return (short)getUIntBEElement(offsetBits_current_x(), 8);
    }

    /**
     * Set the value of the field 'current_x'
     */
    public void set_current_x(short value) {
        setUIntBEElement(offsetBits_current_x(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'current_x'
     */
    public static int size_current_x() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'current_x'
     */
    public static int sizeBits_current_x() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: current_y
    //   Field type: short, unsigned
    //   Offset (bits): 56
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'current_y' is signed (false).
     */
    public static boolean isSigned_current_y() {
        return false;
    }

    /**
     * Return whether the field 'current_y' is an array (false).
     */
    public static boolean isArray_current_y() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'current_y'
     */
    public static int offset_current_y() {
        return (56 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'current_y'
     */
    public static int offsetBits_current_y() {
        return 56;
    }

    /**
     * Return the value (as a short) of the field 'current_y'
     */
    public short get_current_y() {
        return (short)getUIntBEElement(offsetBits_current_y(), 8);
    }

    /**
     * Set the value of the field 'current_y'
     */
    public void set_current_y(short value) {
        setUIntBEElement(offsetBits_current_y(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'current_y'
     */
    public static int size_current_y() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'current_y'
     */
    public static int sizeBits_current_y() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: hit_wall
    //   Field type: short, unsigned
    //   Offset (bits): 64
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'hit_wall' is signed (false).
     */
    public static boolean isSigned_hit_wall() {
        return false;
    }

    /**
     * Return whether the field 'hit_wall' is an array (false).
     */
    public static boolean isArray_hit_wall() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'hit_wall'
     */
    public static int offset_hit_wall() {
        return (64 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'hit_wall'
     */
    public static int offsetBits_hit_wall() {
        return 64;
    }

    /**
     * Return the value (as a short) of the field 'hit_wall'
     */
    public short get_hit_wall() {
        return (short)getUIntBEElement(offsetBits_hit_wall(), 8);
    }

    /**
     * Set the value of the field 'hit_wall'
     */
    public void set_hit_wall(short value) {
        setUIntBEElement(offsetBits_hit_wall(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'hit_wall'
     */
    public static int size_hit_wall() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'hit_wall'
     */
    public static int sizeBits_hit_wall() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: globalTime
    //   Field type: long, unsigned
    //   Offset (bits): 72
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'globalTime' is signed (false).
     */
    public static boolean isSigned_globalTime() {
        return false;
    }

    /**
     * Return whether the field 'globalTime' is an array (false).
     */
    public static boolean isArray_globalTime() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'globalTime'
     */
    public static int offset_globalTime() {
        return (72 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'globalTime'
     */
    public static int offsetBits_globalTime() {
        return 72;
    }

    /**
     * Return the value (as a long) of the field 'globalTime'
     */
    public long get_globalTime() {
        return (long)getUIntBEElement(offsetBits_globalTime(), 32);
    }

    /**
     * Set the value of the field 'globalTime'
     */
    public void set_globalTime(long value) {
        setUIntBEElement(offsetBits_globalTime(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'globalTime'
     */
    public static int size_globalTime() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'globalTime'
     */
    public static int sizeBits_globalTime() {
        return 32;
    }

}
