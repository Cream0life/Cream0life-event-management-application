package org.humber.project.transformers;

import org.humber.project.domain.Booking;
import org.humber.project.entities.BookingEntity;

public class BookingEntityTransformer {
    public static Booking transformToBooking(BookingEntity bookingEntity) {
        Booking booking = new Booking();
        booking.setBookingId(bookingEntity.getBookingId());
        booking.setEventId(bookingEntity.getEventId());
        booking.setUserId(bookingEntity.getUserId());
        booking.setVenueId(bookingEntity.getVenueId());
        booking.setBookingCreationDate(bookingEntity.getBookingCreationDate());
        return booking;
    }

    public static BookingEntity transformToBookingEntity(Booking booking) {
        BookingEntity bookingEntity = new BookingEntity();
        bookingEntity.setBookingId(booking.getBookingId());
        bookingEntity.setEventId(booking.getEventId());
        bookingEntity.setUserId(booking.getUserId());
        bookingEntity.setVenueId(booking.getVenueId());
        bookingEntity.setBookingCreationDate(booking.getBookingCreationDate());
        return bookingEntity;
    }
}
