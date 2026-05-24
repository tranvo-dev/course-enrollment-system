package org.openapitools.configuration;

import java.math.BigDecimal;
import java.net.URI;
import java.util.UUID;

import com.tranvodev.courseenrollment.model.dto.CourseStatusDto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

/**
 * This class provides Spring Converter beans for the enum models in the OpenAPI specification.
 *
 * By default, Spring only converts primitive types to enums using Enum::valueOf, which can prevent
 * correct conversion if the OpenAPI specification is using an `enumPropertyNaming` other than
 * `original` or the specification has an integer enum.
 */
@Configuration(value = "org.openapitools.configuration.enumConverterConfiguration")
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.courseStatusDtoConverter")
    Converter<String, CourseStatusDto> courseStatusDtoConverter() {
        return new Converter<String, CourseStatusDto>() {
            @Override
            public CourseStatusDto convert(String source) {
                return CourseStatusDto.fromValue(source);
            }
        };
    }

}
