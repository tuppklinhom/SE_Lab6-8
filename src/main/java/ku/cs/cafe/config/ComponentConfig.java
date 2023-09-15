package ku.cs.cafe.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
/**
 ---------------------------------
 // Tupp klinhom
 // 6410450966
 ---------------------------------
 **/