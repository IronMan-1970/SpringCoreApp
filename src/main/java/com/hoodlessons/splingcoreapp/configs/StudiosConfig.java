package com.hoodlessons.splingcoreapp.configs;

import com.hoodlessons.splingcoreapp.common.GameStudio;
import com.hoodlessons.splingcoreapp.common.ValveStudio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudiosConfig {
    @Bean("steam")
    public GameStudio valveStudio(){
        return new ValveStudio();
    }
}
