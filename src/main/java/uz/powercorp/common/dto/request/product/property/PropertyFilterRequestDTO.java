package uz.powercorp.common.dto.request.product.property;

import uz.powercorp.common.data.enums.property.*;

public  record PropertyFilterRequestDTO(
        String search,
        PropertyCategory category,
        PropertyType type,
        OfferType offerType,
        ListingStatus listingStatus,
        OccupancyStatus occupancyStatus
) {
}