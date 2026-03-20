import java.util.*;

class InvalidBookingException extends Exception {
    InvalidBookingException(String message) {
        super(message);
    }
}

class RoomInventory {
    HashMap<String, Integer> inventory = new HashMap<>();

    RoomInventory() {
        inventory.put("Single Room", 2);
        inventory.put("Double Room", 1);
        inventory.put("Suite Room", 0);
    }

    void validate(String roomType) throws InvalidBookingException {
        if (!inventory.contains