package com.lovetree.member.service;

import com.lovetree.member.entity.User;
import com.lovetree.member.infrastructure.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final UserRepository memberRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return memberRepository.findOneWithAuthoritiesByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("유저가 존재하지 않습니다."));
    }
}
