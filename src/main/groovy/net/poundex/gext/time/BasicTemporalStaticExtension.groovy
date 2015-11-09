package net.poundex.gext.time

import groovy.transform.CompileStatic

import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId

/**
 * Created by poundera on 09/11/15.
 */
@CompileStatic
class BasicTemporalStaticExtension
{
	public static LocalDate of(final LocalDate type, Instant instant)
	{
		return instant.atZone(ZoneId.systemDefault()).toLocalDate()
	}

	public static LocalDateTime of(final LocalDateTime type, Instant instant)
	{
		return instant.atZone(ZoneId.systemDefault()).toLocalDateTime()
	}
}
