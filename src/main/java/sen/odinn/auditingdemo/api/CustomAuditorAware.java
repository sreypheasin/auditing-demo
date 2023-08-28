package sen.odinn.auditingdemo.api;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class CustomAuditorAware implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // Return the current user's username
        return Optional.of("admin"); // Replace with actual user retrieval logic
    }
}