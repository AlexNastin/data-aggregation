package by.dt.controller;

import by.dt.entity.to.ui.ProductDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@RestController
@RequestMapping(path = "/data-aggregation/v1/product")
public class ProductController {

    @ApiOperation(value = "ProductDTO search", notes = "Return a list of products", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/search", method = RequestMethod.GET)
    public List<ProductDTO> searchProduct(@ApiParam(value = "Barcode") @RequestParam(value = "barcode") String barcode,
                                          @ApiParam(value = "Name of product") @RequestParam(value = "name") String name,
                                          @ApiParam(value = "Id of the trading network") @RequestParam(value = "tradingNetworkId") Long tradingNetworkId,
                                          @ApiParam(value = "Category of product") @RequestParam(value = "category") String category,
                                          @ApiParam(value = "Price 'From'") @RequestParam(value = "priceFrom") Double priceFrom,
                                          @ApiParam(value = "Price 'To'") @RequestParam(value = "priceTo") Double priceTo) {
        return new ArrayList<>();
    }
}
