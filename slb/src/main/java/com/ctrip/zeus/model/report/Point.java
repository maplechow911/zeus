package com.ctrip.zeus.model.report;

public class Point {
    private String m_key;

    private Long m_value;

    public Point() {
    }

    protected boolean equals(Object o1, Object o2) {
        if (o1 == null) {
            return o2 == null;
        } else if (o2 == null) {
            return false;
        } else {
            return o1.equals(o2);
        }
    }



    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point _o = (Point) obj;

            if (!equals(m_key, _o.getKey())) {
                return false;
            }

            if (!equals(m_value, _o.getValue())) {
                return false;
            }


            return true;
        }

        return false;
    }

    public String getKey() {
        return m_key;
    }

    public Long getValue() {
        return m_value;
    }

    @Override
    public int hashCode() {
        int hash = 0;

        hash = hash * 31 + (m_key == null ? 0 : m_key.hashCode());
        hash = hash * 31 + (m_value == null ? 0 : m_value.hashCode());

        return hash;
    }



    public Point setKey(String key) {
        m_key = key;
        return this;
    }

    public Point setValue(Long value) {
        m_value = value;
        return this;
    }

}
