import React from 'react';
import { Link } from 'react-router-dom';

const NavBar = () => {
  return (
    <header style={styles.header}>
      <nav style={styles.navbar}>
        {/* Logo */}
        <h2 style={styles.logo}>Store</h2>

        {/* Navigation Links */}
        <ul style={styles.navLinks}>
          <li><Link to="/" style={styles.link}>Home</Link></li>
          <li><Link to="/products" style={styles.link}>Products</Link></li>
          <li><Link to="/cart" style={styles.link}>Cart</Link></li>
          <li><Link to="/login" style={styles.loginButton}>Login</Link></li>
        </ul>
      </nav>
    </header>
  );
};

// All Styles in One Place
const styles = {
  header: {
    position: 'fixed',       // Stays at the top
    top: 0,
    left: 0,
    width: '100%',
    backgroundColor: '#0f172a', // Dark blue shade
    boxShadow: '0 3px 8px rgba(0,0,0,0.3)',
    zIndex: 1000,
  },
  navbar: {
    display: 'flex',
    justifyContent: 'space-between',
    alignItems: 'center',
    padding: '15px 50px',
  },
  logo: {
    color: '#38bdf8',          // Light blue
    fontSize: '26px',
    fontWeight: '700',
    letterSpacing: '1px',
  },
  navLinks: {
    listStyle: 'none',
    display: 'flex',
    gap: '25px',
    margin: 0,
    padding: 0,
  },
  link: {
    color: 'white',
    textDecoration: 'none',
    fontSize: '18px',
    transition: 'color 0.3s ease',
  },
  loginButton: {
    backgroundColor: '#38bdf8',
    color: '#0f172a',
    padding: '8px 14px',
    borderRadius: '6px',
    textDecoration: 'none',
    fontWeight: '600',
    transition: 'all 0.3s ease',
  },
};

// Add basic hover effects using CSS inside JS
const addHoverEffect = () => {
  const styleSheet = document.styleSheets[0];
  styleSheet.insertRule(
    `a:hover { color: #eef1f3ff !important; }`,
    styleSheet.cssRules.length
  );
  styleSheet.insertRule(
    `a[href="/login"]:hover { background-color: #14a5dfff !important; transform: scale(1.05); }`,
    styleSheet.cssRules.length
  );
};

addHoverEffect();

export default NavBar;
