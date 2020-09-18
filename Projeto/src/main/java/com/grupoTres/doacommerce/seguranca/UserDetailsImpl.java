package com.grupoTres.doacommerce.seguranca;
	
	import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
	import org.springframework.security.core.userdetails.UserDetails;

import com.grupoTres.doacommerce.model.Usuario;

	public class UserDetailsImpl implements UserDetails{

		private static final long serialVersionUID = 1L;
		private String username;
		private String password;
		private List<GrantedAuthority> authorities;
		
		
		public UserDetailsImpl(Usuario usuario) {
			this.username = usuario.getEmail();
			this.password = usuario.getSenha();
		}
		
		public UserDetailsImpl() {}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			// TODO Auto-generated method stub
			return authorities;
		}

		@Override
		public String getPassword() {
			// TODO Auto-generated method stub
			return password;
		}

		@Override
		public String getUsername() {
			// TODO Auto-generated method stub
			return username;
		}

		@Override
		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return true;
		}

	}


